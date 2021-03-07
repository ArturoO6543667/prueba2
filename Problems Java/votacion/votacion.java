package diseñoAlgoritmos;

import java.util.Scanner;

public class votacion {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int x, y, cont = 0;
        System.out.println("Ingrese el numero de integrantes: ");
        y = leer.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.print(i);
        }
        System.out.println("\nIngrese el numero de votos: ");
        x = leer.nextInt();
        int[] m = new int[x];
        for (int i = 0; i < m.length; i++) {
            m[i] = leer.nextInt();
     
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] > m[j]) {
                    cont++;
                }          
            }
             System.out.print(cont+",");
         cont=0;
        }
       
    }
}
