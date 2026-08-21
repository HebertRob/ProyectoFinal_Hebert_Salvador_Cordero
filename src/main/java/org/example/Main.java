package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
    static int obtenerFactorial(int n,int i)
    {   int factorial=1;
        for(i=1;i<=n;i++)
        { factorial=factorial*i;}
        return factorial;}
   static int obtenerPotencia(int n)
    {   int potencia=n*n;
        return potencia;}
    static int obtenerSuma(int n)
    {   int suma=0;
        for(int i=1;i<=n;i++)
        { suma=suma+i;}
        return suma;}
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        //DECLARACION DE VARIABLES
        int opcion,factorial,suma=0,i=1,k,n,potencia;
        //ENTRADA DE DATOS
        System.out.println("MENU DE OPCIONES:\n\n");
        System.out.println("1.-Factorial de un numero entero:\n");
        System.out.println("2.-Suma de n numeros naturales:\n");
        System.out.println("3.-Potencia al cuadrado de un numero entero:\n");
        System.out.println("ELIJA UNA OPCION:\n");

        opcion=teclado.nextInt();
        switch(opcion)
        {
            case 1:
            System.out.println("Ingrese el valor de n:");
                 n=teclado.nextInt();
                factorial=obtenerFactorial(n,i);
                System.out.println("El factirial de n es n!="+factorial);
                break;
            case 2:
             System.out.println("Ingrese el valor de n:");
                n=teclado.nextInt();
                suma=obtenerSuma(n);
                System.out.println("La suma de la serie de n numeros naturales es:"+suma);
                break;
            case 3:
                System.out.println("Ingrese el valor de n:");
                n=teclado.nextInt();
                potencia=obtenerPotencia(n);
                System.out.println("La potencia al cuadrado de n es:"+potencia);
                default :
             System.out.println("¡OPCION NO VALIDA!");
        }


    }
}
