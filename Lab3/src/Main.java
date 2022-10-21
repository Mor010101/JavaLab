import p1.CNP_Eronat;
import p1.Persoana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CNP_Eronat {
        Persoana pers = new Persoana("name", "01");
        Scanner in = new Scanner(System.in);

        while(pers.CnpCheck() == false) {
            pers.setCnp(in.nextLine());
            if(pers.CnpCheck() == false)
                System.out.println("CNP eronat");
        }

        System.out.println("CNP corect | varsta: " + pers.getVarsta());
    }
}