//para importar todas las clases poner import nomPack.*
//o import nomPack nomClass
package estructura;
public class datos {

    private String nombre;
    private String apellido;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    public datos(String nombre, String apellido, int edad, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(int nota) {
        this.nota1 = nota;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

}
