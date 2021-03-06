package Problema2Circulos;

public class Problema2
{
    public static void main(String[] args) {
        String respuesta, respuesta2,respuesta3;
        Metodo a  = new Metodo(5,6,3.5,10,5,3);
        respuesta = a.ejecutar();
        System.out.println(a.toString()  + " Respuesta : " + respuesta  );

        Metodo b = new Metodo(3.5 , 5 ,2 , 10,4,3);
        respuesta2 = b.ejecutar();
        System.out.println(b.toString() + "Respuesta2 :" + respuesta2);

        Metodo c = new Metodo(5 , 4.5 ,3 , 6,5,4.5);
        respuesta3 = c.ejecutar();
        System.out.println(c.toString() + "Respuesta3 :" + respuesta3);
    }
}
