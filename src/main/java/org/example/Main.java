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
   static double obtenerRaiz(double n)
    {   double raiz=Math.pow(n,0.5);
        return raiz;}
    static int obtenerSuma(int n)
    {   int suma=0;
        for(int i=1;i<=n;i++)
        { suma=suma+i;}
        return suma;}
    static int obtenerNumSecreto(int n)
    {   boolean adivino=true,noadivino=false;
        if(n>1&&n<3)
          {System.out.println("¡ADIVINASTE EL NUMERO SECRETO! "+adivino);}
           else
            {System.out.println("¡FALLASTE! "+noadivino);}
           return 0;
    }
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        //DECLARACION DE VARIABLES
        int opcion,factorial,suma=0,i=1,k,n,potencia,secreto;
        double raiz;
        String raza="SNAUSER";

        System.out.println("MENU DE OPCIONES:\n\n");
        System.out.println("1.-Factorial de un numero entero:\n");
        System.out.println("2.-Suma de n numeros naturales:\n");
        System.out.println("3.-Raiz cuadrada de un numero positivo:\n");
        System.out.println("4.-ADIVINE EL NUMERO SECRETO:\n");
        System.out.println("5.-Raza de Perro:\n");
        System.out.println("6.-Ver si un numero es Primo:\n");
        System.out.println("ELIJA UNA OPCION:\n");
        //ENTRADA DE DATOS

        opcion=teclado.nextInt();
       //PROCESO DE CALCULOS

        switch(opcion)
        {
            case 1:
            System.out.println("Ingrese el valor de n:");
                 n=teclado.nextInt();
                if(n==0)
                { System.out.println("El fatorial es "+n+"!=1");}
                  else if(n>0)
                   {
                    factorial=obtenerFactorial(n,i);
                    System.out.println("El factirial es "+n+"!="+factorial);}
                   else
                    { System.out.println("¡EL NUMERO DEBE DE SER POSITIVO!");}
                break;
            case 2:
             System.out.println("Ingrese el valor de n:");
                n=teclado.nextInt();
               if(n>=0)
                {
                suma=obtenerSuma(n);
                System.out.println("La suma de la serie de numeros naturales de 1 al "+n+" es: "+suma);}
                 else
                  {System.out.println("¡EL NUMERO DEBE DE SER POSITIVO!");}
                break;
            case 3:
                System.out.println("Ingrese el valor de n:");
                n=teclado.nextInt();
                if(n>=0)
                {raiz=obtenerRaiz(n);
                System.out.println("La raiz cuadrada de n es:"+raiz);}
                 else
                  {System.out.println("¡EL NUMERO DEBE DE SER POSITIVO!");}
                break;
            case 4:
                System.out.println("Ingrese el valor del numero secreto (1, 2 o 3):");
                n=teclado.nextInt();
               secreto=obtenerNumSecreto(n);
                break;
            case 5:
                System.out.println("RAZA FAVORITA DE PERRO:\n");
                System.out.println("La raza del perro es: " + raza);
                break;
            case 6:
                System.out.println("Ingrese un numero para verificar si es primo:");
                n=teclado.nextInt();
                k=0;
                for(i=1;i<=n;i++)
                { if (n%i==0) 
                   { k++; }
                  }
                if (k==2) 
                 {  System.out.println("El numero " + n + " ES PRIMO.")  } 
                else 
                 {  System.out.println("El numero " + n + " NO ES PRIMO."); }
                break 
            default:
                System.out.println("¡OPCION NO VALIDA!");
        }
    }
}
