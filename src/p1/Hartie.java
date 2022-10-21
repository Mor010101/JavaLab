package p1;

public class Hartie extends Echipament{
    private int ppm;

    public Hartie(String name, String zonaMag, int nrInv, int pret, State state, int ppm) {
        super(name, zonaMag, nrInv, pret, state);
        this.ppm = ppm;
    }
}
