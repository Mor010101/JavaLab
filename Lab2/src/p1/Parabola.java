package p1;

public class Parabola {
    private double a, b, c;

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }
    public Parabola(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  Parabola(Parabola parabola){
        this.a = parabola.a;
        this.b = parabola.b;
        this.c = parabola.c;
    }

    public double showFunc(double x){
        var result = a*x*x + b*x +c;
        System.out.println(result);
        return  result;
    }

    private double varfX()
    {
        return  (-this.b/(2* this.a));
    }

    private double varfY()
    {
        return  ((-(this.b* this.b)+4*this.a* this.c)/(4* this.a));
    }

    public void coordVarf(){
        System.out.print(-b/(2*a) + " = " + this.varfX() + "\n");
        System.out.println((-(b*b)+4*a*c)/(4*a) + " = " + this.varfY());
    }

    public static void calcMid(Parabola p1, Parabola p2){
        var x = (p1.varfX()+p2.varfX())/2;
        var y = (p1.varfY()+ p2.varfY())/2;

        System.out.println(x + " " + y);
    }
}
