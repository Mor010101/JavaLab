
import p1.Parabola;

public class Main {
    public static void main(String[] args) {
        Parabola p1 = new Parabola(1, 3, 5);
        Parabola p2 = new Parabola(p1);

        double r = p1.showFunc(5);

        p2.setA(5);
        double x = p2.getA();

        p2.coordVarf();

        Parabola.calcMid(p1 , p2);
    }


}