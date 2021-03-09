import java.util.Random;
import java.util.RandomAccess;

public class Auto {


    int kennzeichen;
    int ps;

    String name;
    String marke;
    String kanton;




    public Auto(int ps, String name, String marke,String kanton){
        Random random = new Random();
        this.ps =ps;
        this.name = name;
        this.marke = marke;
        this.kennzeichen = random.nextInt(999999);
        this.kanton =kanton;
    }






    public String getName() {return name;}

    public int getKennzeichen() {return kennzeichen;}

    public int getPs() {return ps;}

    public String getKanton() {return kanton;}

    public String getMarke() {return marke;}

}
