
package progegl008;

import java.util.Scanner;


public class ProgEGL008 {

    public static void main(String[] args) {
       int Numero;
       Double x, raiz;
       System.out.println("Datos entrada:");
       System.out.println("Ingrese el numero:");
       Scanner Leer=new Scanner(System.in);
       Numero= Leer.nextInt();
       raiz= Math.cbrt(Numero);
       for(x=raiz; x>=0; x--)
       {
           if(x==0)
           {
               System.out.println("El numero es un cubo");
               System.exit(0);
           }
       }
       System.out.println("El numero no es un cubo");
    }
    
}
