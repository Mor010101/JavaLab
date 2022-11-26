package org.example;

public class Persoana {
    private int Id;
    private String nume;
    private int varsta;

    @Override
    public String toString() {
        return "Persoana{" +
                "Id=" + Id +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoana(int id, String nume, int varsta) {
        Id = id;
        this.nume = nume;
        this.varsta = varsta;
    }
}
