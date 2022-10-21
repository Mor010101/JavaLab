package p1;

enum State{
    ACHIZITIONAT,
    EXPUS,
    VANDUT,
}

public class Echipament {
    private String name, ZonaMag;
    private int nrInv, pret;
    private State state;

    public Echipament(String name, String zonaMag, int nrInv, int pret, State state) {
        this.name = name;
        ZonaMag = zonaMag;
        this.nrInv = nrInv;
        this.pret = pret;
        this.state = state;
    }
}
