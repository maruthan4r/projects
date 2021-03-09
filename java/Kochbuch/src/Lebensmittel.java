public class Lebensmittel {

    String name;
    String einheit;
    double menge;

    public Lebensmittel(){}

    public Lebensmittel(String name, String einheit, double menge){
        this.name=name;
        this.einheit=einheit;
        this.menge=menge;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setEinheit(String einheit){this.einheit = einheit;}
    public String getEinheit(){return einheit;}


    public void setMenge(double menge){this.menge = menge;}
    public double getMenge(){return menge;}

}
