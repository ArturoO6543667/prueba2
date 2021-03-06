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
    //public Metodo(){ }
    public Metodo(double CoordenadaX1, double CoordenadaY1 , double Radio1, double CoordenadaX2, double CoordenadaY2,double
                  Radio2){
        this.x = CoordenadaX1 ;
        this.y = CoordenadaY1;
        this.radio1 =Radio1;
        this.x2 = CoordenadaX2 ;
        this.y2 =CoordenadaY2 ;
        this.radio2= Radio2;
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
        String var= "esto no funca";
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
        if(this.distancia_centros==0 && (this.x==this.x2 && this.y ==this.y2)){
            return "circunferencias iguales";
        }
        if(this.distancia_centros == diferencia_radios()){
            return "intersectan, tangentes interiores";
        }

        if(this.distancia_centros == 0 &&(this.x != this.x2 || this.y != this.y2)){
            return "no se intersectan , mismo radio";
        }

        else return var;

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
