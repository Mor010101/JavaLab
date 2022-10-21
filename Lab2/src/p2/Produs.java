package p2;

import java.util.Scanner;

public class Produs {
    private String name;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    private int quant;

    public Produs(String name, float price, int quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public String toString(){
        String result = this.name + " " + this.quant + " " + this.price;
        return result;
    }

}
