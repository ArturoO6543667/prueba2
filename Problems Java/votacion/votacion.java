package diseñoAlgoritmos;
//lo ultimo
import java.util.Arrays;
import java.util.Scanner;

public class votacion {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int miembros, votos;
        String OrdenVotos, VotosRealizados;
        System.out.print("Ingrese el numero de miembros de la familia  : ");
        miembros = Integer.parseInt(leer.nextLine());

        System.out.print("Ingrese la cantidad de Votos Emitidos : ");
        votos = Integer.parseInt(leer.nextLine());

        String[] Vector, Vector1;
        System.out.print("Ingrese el orden de los votos emitidos: ");
        OrdenVotos = leer.nextLine();
        Vector = OrdenVotos.split(" ");// los datos se ingresaon separados por un espacio("1 2 3")

        System.out.print("Ingrese los votos : ");
        VotosRealizados = leer.nextLine();
        Vector1 = VotosRealizados.split(" ");

        // Primero el vector Nro 2 porque tiene prioridad
        int parametro = votos; // se lo iguala para tener el numero correcto
        int x[], x1[];
        x = new int[parametro];
        x1 = new int[parametro];
        for (int i = 0; i < Vector1.length; i++) {

            x[i] = Integer.parseInt(Vector1[i]); // colocando un string a un vector
            System.out.print(x[i]);
        }
        System.out.println();
        for (int i = 0; i < Vector.length; i++) {
            x1[i] = Integer.parseInt(Vector[i]);
            System.out.print(x1[i]);
        }
        Arrays.sort(x);// primero ordene los votos
        int cont = 0;
        int aux = x[0];
        int var_aux = 0, persona = -1;

        for (int i = 0; i < x.length; i++) {
            if (aux == x[i]) {
                cont++;
            } else {
                System.out.println("\nLa persona " + aux + " tiene " + cont + " voto");
                if (var_aux < cont) {
                    var_aux = cont;
                    persona = aux;
                }
                System.out.println("miaux = " + var_aux + "mi persona es  : " + persona);
                cont = 1;
                aux = x[i];
            }

        }
        System.out.println("\nhoalaa :La persona " + aux + " tiene " + cont + " voto");
        System.out.println("\n mi variable aux vale : " + var_aux);

        int mayor = 0;
        if (cont > mayor) {
            mayor = cont;
        }
        System.out.println("La persona que se queda sin chuleta es la persona: " + persona);

        // sry puse muchos mensajes pero era porque me confunfia con los numeros :(

        // listo :3!!

    }
    // hasta aqui obtuve los datos ingresados convertidos a string,
}
