
package estructura;


public class llenado {
    public static void main(String args[]){
        datos persona=new datos("Ruben","morales",20,100,90,98);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad:"+persona.getEdad());
        System.out.println("Nota1: "+persona.getNota1());
        System.out.println("Nota2: "+persona.getNota2());
        System.out.println("Nota3: "+persona.getNota3());
        System.out.println("Promedio:"+(persona.getNota1()+persona.getNota2()+persona.getNota3())/3);
             
    }
}
