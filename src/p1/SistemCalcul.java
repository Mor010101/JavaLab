package p1;

enum SystemType{
    WIN,
    LINUX,
}

public class SistemCalcul extends Echipament{
    private String monitorType;
    private int procFreq, hddSize;
    SystemType systemType;

    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    public SistemCalcul(String name, String zonaMag, int nrInv, int pret, State state, String monitorType, int procFreq, int hddSize, SystemType systemType) {
        super(name, zonaMag, nrInv, pret, state);
        this.monitorType = monitorType;
        this.procFreq = procFreq;
        this.hddSize = hddSize;
        this.systemType = systemType;
    }
}
