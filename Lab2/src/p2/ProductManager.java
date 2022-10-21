package p2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SortByPrice implements Comparator<Produs>
{
    public int compare(Produs a, Produs b)
    {
        return Math.round(a.getPrice() - b.getPrice());
    }

}

public class ProductManager {
    private List<Produs> productList;

    public void readFromFile(Scanner input){
        while(input.hasNext()){
            String line = input.next();
            String tokens[] = line.split(";");
            Produs p = new Produs(tokens[0], Float.valueOf(tokens[1]), Integer.valueOf(tokens[2]));
            productList.add(p);
        }
    }

    public void printToConsole(){
        System.out.println("Name  Price   Quantity");
        for (Produs p : productList) {
            System.out.println(p.toString());
        }
    }

    public void printLessThan(int q)
    {
        System.out.println("Name  Price   Quantity");
        for (Produs p : productList) {
            if(p.getQuant() < q)
                System.out.println(p.toString());
        }
    }

    public void minMaxtoFile(FileWriter output) throws IOException {
        Collections.sort(productList,new SortByPrice());
        Produs min = productList.get(0);
        Produs max = productList.get(productList.size()-1);

        output.write("Min " + min.toString()+"\n");
        output.write("Max" + max.toString()+"\n");
    }
}
