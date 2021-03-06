package diseñoAlgoritmos;

import static java.lang.Math.abs;
import java.util.Scanner;

public class interseccionCircunferencia {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        double x1, x2, y1, y2, r1, r2, s, n1, n2, t, r, ab;
        final double pi = 3.14;
        System.out.println("Ingrese un valor para x1");
        x1 = leer.nextFloat();
        System.out.println("Ingrese un valor para y1");
        y1 = leer.nextFloat();
        System.out.println("Ingrese un valor para r1");
        r1 = leer.nextFloat();
        System.out.println("Ingrese un valor para x2");
        x2 = leer.nextFloat();
        System.out.println("Ingrese un valor para y2");
        y2 = leer.nextFloat();
        System.out.println("Ingrese un valor para r2");
        r2 = leer.nextFloat();
        System.out.println("x1: " + x1);
        System.out.println("x1: " + y1);
        System.out.println("x1: " + r1);
        System.out.println("x1: " + x2);
        System.out.println("x1: " + y2);
        System.out.println("x1: " + r2);
        s = r1 + r2;
        r = r1 - r2;
        if (r < 0) {
            r = r * (-1);
        }
     //   System.out.println(r);
        n1 = (x2 - x1);
        n2 = (y2 - y1);
        double c1 = Math.pow(n1, 2);
        double c2 = Math.pow(n2, 2);
        t = c1 + c2;

        double d = Math.sqrt(t);
        if ( d > 0 & d < r & d == s & d == r & d == 0) {           
            System.out.println("No se intersectan");
        }
        else if(d < s & d > r){
            System.out.println("Se intersectan");
        }
        else if(r1==r2&x1==x2&y1==y2){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No se intersectan");
        }
        
    }
}
