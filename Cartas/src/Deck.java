import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck
{
    private final ArrayList<Card>deck;

    public Deck()
    {
        deck = new ArrayList<>();
        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Rojo", "Negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        for (int p = 0; p<2; p++)
            for (String valore : valores) deck.add(new Card(palos[p], colores[0], valore));
        for (int p=2;p<4;p++)
            for (String valore : valores) deck.add(new Card(palos[p], colores[1], valore));
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck con un total: " + deck.size() +" cartas");
    }

    public void head()
    {
        System.out.println("Draw de primer carta");
        System.out.println("Se remueve del Deck la carta: "+deck.get(0));
        deck.remove(0);
        System.out.println("Quedan: "+deck.size()+" cartas");
    }

    public void pick()
    {
        Random random = new Random();
        System.out.println("Draw de carta al azar");
        System.out.println("Se remueve del Deck la carta: "+deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan: " + deck.size() + " cartas");
    }

    public void hand() {
        System.out.println("Draw de tu mano de cartas: " );
        if (deck.size()<5)
        {
            System.out.println("Sin cartas suficientes");
        }
        else
        {
            System.out.println(deck.get(0).toString());
            System.out.println(deck.get(1).toString());
            System.out.println(deck.get(2).toString());
            System.out.println(deck.get(3).toString());
            System.out.println(deck.get(4).toString());
            deck.subList(0,5).clear();
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}