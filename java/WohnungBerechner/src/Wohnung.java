public class Wohnung {


    String name;
    int max_raeume=15;
    Raum[] raumArray = new Raum[max_raeume];
    int anzRaeume = 0;
    double wohnungsflaeche;


    public Wohnung(String name){this.name = name;}

    public Raum[] getRaumArray(){return raumArray;}

    public void setWohnung(Raum[] wohnung){this.raumArray = wohnung;}

    public double getFlaeche(){return wohnungsflaeche;}

    public void setName(String name) {this.name = name;}

    public String getName(){return name;}





    public void addRaum(Raum raum) {
        raumArray[anzRaeume]= raum;
        anzRaeume++;
    }




    public double wohnungsFlaecheberechnen(){
        for(int i = 0;i<raumArray.length;i++){
            double raumFlaeche = raumArray[i].raumFlaecheBerechnen();
            wohnungsflaeche = raumFlaeche + wohnungsflaeche;
        }
        return wohnungsflaeche;
    }


}
