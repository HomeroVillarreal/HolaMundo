import java.io.*;
import java.util.Scanner;

/**
 * @author Homero Villarreal
 */
public class Main {
    public String nombre;
    public int calificaciones[];
    public double promedio;

    public static void main(String[] args)
    {
        Main main=new Main();
        main.pedirnombre();
        main.pedircals();
        main.mostrarcals();
    }
    public void pedirnombre()
    {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=entrada.nextLine();
    }
    public void pedircals()
    {
        calificaciones=new int[5];
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese las calificaciones:");
        for (int i=0; i<5; i++)
        {
            System.out.print("Calificacion " + (i+1));
            calificaciones[i]=entrada.nextInt();
            promedio=promedio+calificaciones[i];
        }
    }
    public void mostrarcals()
    {
        System.out.println("Nombre: "+nombre);
        for (int i=0; i<5; i++)
        {
            System.out.println("Calificacion "+(i+1)+ " " + calificaciones[i]);
        }
        System.out.println("Promedio: "+(promedio/5));
        if ((promedio/5)>=91)
        {
            System.out.println("Calificacion final: A");
        }
        else if((promedio/5)>=81&&(promedio/5)<=90)
        {
            System.out.println("Calificacion final: B");
        }
        else if((promedio/5)>=71&&(promedio/5)<=80)
        {
            System.out.println("Calificacion final: C");
        }
        else if((promedio/5)>=61&&(promedio/5)<=70)
        {
            System.out.println("Calificacion final: D");
        }
        else
        {
            System.out.println("Calificacion final: F");
        }
    }
}

