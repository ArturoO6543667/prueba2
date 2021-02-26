//Escriba un programa que pregunte al usuario la hora actual t del reloj y
//un número entero de horas h, que indique qué hora marcará el reloj dentro
//de h horas:
package programasSimples;

import java.util.Scanner;

public class horaFutura {

    public static void main(String args[]) {
        int hora, cantHrs,marHora=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la hora actual: ");       
        hora = leer.nextInt();      
        if(hora<=24&&hora>=0){ 
        System.out.println("Escriba una cantidad de hr entera: ");
        cantHrs = leer.nextInt();
        System.out.println("La hora actual es: " + hora);
        System.out.println("Cantidad de horas: " + cantHrs);
            marHora=hora+cantHrs;
            while(marHora>=24){               
                marHora=marHora-24;
            }
            System.out.println("En "+cantHrs+" el reloj marca las "+marHora+" hr");
        }       
        else{
                System.out.println("La hora que ingreso no existe");
            
        }
        
    }
}
