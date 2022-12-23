package practice_tasks;

abstract class Figure{
    private double a, v, r;

    public Figure(double a, double v, double r) {
        this.a = a;
        this.v = v;
        this.r = r;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setV(double v) {
        this.v = v;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getA() {
        return a;
    }

    public double getV() {
        return v;
    }

    public double getR() {
        return r;
    }

    abstract double displayArea();

    abstract double displayVolume();

}
class Cone extends Figure{
    private double h;
    private double  s;

    public Cone(double a, double v, double r, double h, double s) {
        super(a, v, r);
        this.h = h;
        this.s = s;
    }

    @Override
    public double displayArea() {
        return getA();
    }

    @Override
    public double displayVolume() {
        return getV();
    }

    public void calcArea(){
        float a= (float) ((Math.PI * this.s * getR() ) +(Math.PI * 2 * getR() ));
        this.setA(a);
    }
    public void calcVol(){
        float v= (float) ((Math.PI * getR()* getR() * this.h ) / 3);
        this.setV(v);
    }
}
public class hw {
    public static void main(String[] args){
        Cone C1= new Cone(1,2,3,4,5);
        C1.calcArea();
        C1.calcVol();
        System.out.println(C1.displayArea());
        System.out.println(C1.displayVolume());
    }
}
