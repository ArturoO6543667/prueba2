package Problema2Circulos;

public class Metodo
{
    private  double     x;
    private double y;
    private double radio1;
    private double x2;
    private double y2;
    private double radio2;
    private double distancia_centros;
    private double distancia_radios;
    private double diferencia_radios;
    //public Metodo(){ }
    public Metodo(double x, double y , double r, double x2, double y2,double r2){
        this.x = x ;
        this.y = y;
        this.radio1 = r;
        this.x2 = x2 ;
        this.y2 =y2 ;
        this.radio2= r2;
    }
    public void calcular_distancia(){
        double d1 = Math.pow((this.x - this.x2),2);
        double d2 = Math.pow((this.y - this.y2),2 );
        this.distancia_centros= Math.sqrt(d1+d2);
    }
    public void sumarRadios(){

        this.distancia_radios = this.radio1 + this.radio2;
    }

    public double diferencia_radios(){
        double diferencia;
        diferencia= this.radio1 - this.radio2;
        if(diferencia<0){ diferencia =  diferencia * -1;}
        return diferencia;
    }
    public String verificacion(){
        if (this.distancia_centros > this.distancia_radios){
            return " no se intersectan, exteriores";
        }
        if (this.distancia_centros < this.distancia_radios && this.distancia_centros> diferencia_radios()){
            return "intersectan , secantes";
        }
        if (this.distancia_centros>0 && this.distancia_centros<diferencia_radios()){
            return "no tienen puntos en comun, circunferencia dentro la otra";
        }
        if ( this.distancia_centros == this.distancia_radios){
            return "intersectan, tangentes exteriores";
        }
        if(this.distancia_centros == diferencia_radios()){
            return "intersectan, tangentes interiores";
        }
        else return "no se intersectan";

    }
    public String ejecutar(){
        calcular_distancia();
        sumarRadios();
        return verificacion();
    }
    @Override
    public String toString() {
        return "Metodo{" +
                "x=" + x +
                ", y=" + y +
                ", radio1=" + radio1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", radio2=" + radio2 +
                ", distancia centros=" + distancia_centros +
                ", distancia radios=" + distancia_radios +
                '}';
    }
}
