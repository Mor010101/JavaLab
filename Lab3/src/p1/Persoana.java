package p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;


public class Persoana {
    private String name;
    private String cnp;

    private String validationCnp = "279146358279";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Persoana(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;

    }

    public boolean CnpCheck() throws CNP_Eronat {
        if(!cnp.matches("[0-9]{13}")) {
            //System.out.println("regex err");
            return false;

        }
        getVarsta();


        return true;
    }



    public int getVarsta() throws CNP_Eronat {

        String date;

        if(cnp.charAt(0)<'3')
            date = "19";
        else
            date = "20";

        date += cnp.substring(1,7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate birthDate = LocalDate.parse(date, formatter);
        LocalDate currentDate = LocalDate.now();

        if(birthDate.isAfter(currentDate))
            throw new CNP_Eronat();

        return currentDate.getYear() - birthDate.getYear();

    }


}
