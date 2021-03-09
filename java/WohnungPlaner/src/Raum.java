public class Raum {

    String  name= "LEER";
    double  laenge=0;
    double  breite=0;
    double  flaeche=0;



    //Konstruktor (Parameter, Standard)
    public Raum(String name, double laenge, double breite){
        this.name       = name;
        this.laenge     = laenge;
        this.breite     = breite;
        this.flaeche    = laenge*breite;
    }
    public Raum(){}

    //GETTER,SETTER
    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public String getName() {
                    return name;
    }
}
