package p1;

enum CopyType{
    A4,
    A3,
}

public class Copiator extends Hartie{
    private int pagesPerToner;

    public CopyType getCopyType() {
        return copyType;
    }

    public void setCopyType(CopyType copyType) {
        this.copyType = copyType;
    }

    CopyType copyType;

    public Copiator(String name, String zonaMag, int nrInv, int pret, State state, int ppm, int pagesPerToner) {
        super(name, zonaMag, nrInv, pret, state, ppm);
        this.pagesPerToner = pagesPerToner;
    }

    @Override
    public String toString() {
        return "Copiator{" +
                "pagesPerToner=" + pagesPerToner +
                ", copyType=" + copyType +
                '}';
    }
    
}
