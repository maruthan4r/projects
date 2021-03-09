public class Raum {

    String name;
    double laenge;
    double breite;



    public Raum (String name, double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
        this.name = name;
    }

    public Raum(String name){}


    public void setLaenge(double laenge){ this.laenge = laenge;}
    public double getLaenge(){return laenge;}

    public void setBreite(double breite){ this.breite = breite;}
    public double getBreite(){return breite;}

    public String getName() {return name;}

    public double raumFlaecheBerechnen(){
        double flaeche=0;
        flaeche = laenge*breite;
        return flaeche;
    }



}
