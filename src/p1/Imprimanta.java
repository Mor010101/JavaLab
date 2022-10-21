package p1;

enum PrintType{
    COLOR,
    ALBNEGRU,
}

public class Imprimanta extends Hartie{
    private int rezolutie, pagePerCartrige;
    private PrintType printType;

    public PrintType getPrintType() {
        return printType;
    }

    public void setPrintType(PrintType printType) {
        this.printType = printType;
    }

    public Imprimanta(String name, String zonaMag, int nrInv, int pret, State state, int ppm, int rezolutie, int pagePerCartrige) {
        super(name, zonaMag, nrInv, pret, state, ppm);
        this.rezolutie = rezolutie;
        this.pagePerCartrige = pagePerCartrige;
    }
}
