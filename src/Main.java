import p1.Copiator;
import p1.Echipament;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Echipament> deviceList = new ArrayList<Echipament>();
        File input = new File("electronice.txt");
        Scanner reader = new Scanner(input);

        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] tokens = line.split(";");

            switch (tokens[5]){
                case "Copiator":
                    //deviceList.add(new Copiator(tokens[0], tokens[3], tokens[1], tokens[2], Taskbar.State.valueOf(tokens[4]), ))
                    break;
                case "Imprimanta":
                    break;
                case "SistemCalcul":
                    break;
                default:
                    throw new Exception("Wrong type");
            }
        }
    }
}