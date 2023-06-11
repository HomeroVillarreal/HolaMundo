public class Card
{
    private final String palo;
    private final String color;
    private final String valor;

    public Card(String palo, String color, String valor)
    {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
        public String toString()
        {
        return "{"+palo+"},{"+color+"},{"+valor+"}";
        }
}