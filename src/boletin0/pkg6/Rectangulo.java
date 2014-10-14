
package boletin0.pkg6;

public class Rectangulo {
    
    public String color;
    private double base;
    private double altura;
    
//constructores
    public Rectangulo(){
        }
    
    public Rectangulo(String c,double b,double al){  
        color=c;
        base=b;
        altura=al;
    }
            
    public Rectangulo(double ba, double alt){
        base=ba;
        altura=alt;
    }

//metodos de acceso
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base=base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
//calcular Area y Perimetro
    public double calcularArea(double base, double altura) {               
        return base*altura;
    /* double area= base*altura;
       return area; */ 
    }
    public void calcularPerimetro(double base, double altura) {
        double perimetro;
        perimetro= base*2 + altura*2;
        System.out.println("Perimetro = "+perimetro);
        //System.out.println("Perimetro = "+(base*2+altura*2));
    }
    
}
