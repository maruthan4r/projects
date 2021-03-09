public class Wohnung {

    String name;
    int max_raum    =   15;
    int anzRaum=0;
    double flaeche;
    Raum[]raumArray;

    //Konstruktor
    public Wohnung(String name){
        this.name   =   name;
        raumArray   =   new Raum[max_raum];
        anzRaum     =   0;
        flaeche     =   0;
    }


    //Fügt einen Raum hinzu
    public void addRaum(Raum raum){
        raumArray[anzRaum] = raum;
        anzRaum++;
        flaeche = raum.getFlaeche() + flaeche;
    }

    //Löscht eine Wohnung
    public void removeRaum(int nummer){

        // IF: Fehlerbehandlung
        // ELSE: Löschen des Raumes


        if (nummer > anzRaum || nummer < 0) {

            System.out.println("Nicht gültig, bitte erneut eingeben.");
        } else {
            Raum[] raumArrayCopy = new Raum[max_raum];
            int anzRaumCopy = 0;
            for (int i = 0; i < anzRaum; i++) {
                if (i != nummer) {
                    raumArray[anzRaumCopy] = raumArray[i];
                    anzRaumCopy++;
                }
            }
            raumArray = raumArrayCopy;
            anzRaum = anzRaumCopy;


        }
    }

    //Listet alle Wohnungen auf
    public void showRaum(Wohnung wohnung) {

        Raum[] raumArray = new Raum[15];
        raumArray = wohnung.getRaumArray();
        if (anzRaum == 0) {
            System.out.println("Die Wohnung ist leer.");
        } else {
            System.out.println("Name der Wohnung: "    + wohnung.getName());
            System.out.println("Gesamtfläche: "        + wohnung.getFlaeche() + " m2");
            System.out.println("Anzahl Räume: "        + wohnung.getAnzRaum());
            anzRaum = wohnung.getAnzRaum();
            for (int i = 0; i<anzRaum;i++){
                System.out.println(raumArray[i].getName() +" "+raumArray[i].getLaenge() +"m x "+ raumArray[i].getBreite()+"m = "+raumArray[i].getFlaeche() + " m2");
            }
        }
    }

    //GETTER,SETTER
    public String getName(){
        return name;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public int getAnzRaum() {
        return anzRaum;
    }

    public Raum[] getRaumArray() {
        return raumArray;
    }
}


