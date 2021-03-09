public class Hochhaus {

    //Hauptgebäude: Hier werden alle Wohnungen gespeichert.

    int max_wohnung = 50;
    int anzWohnung=0;
    Wohnung[] wohnungArray;

    //Konstruktor für das Hochhaus
    public Hochhaus() {
        wohnungArray = new Wohnung[max_wohnung];
        anzWohnung = 0;
    }

    // Fügt eine Wohnung hinzu
    public void addWohnung(Wohnung wohnung) {
        wohnungArray[anzWohnung] = wohnung;
        anzWohnung++;
    }

    //Löscht eine Wohnung
    public void removeWohnung(int nummer){

        // IF: Fehlerbehandlung
        // ELSE: Löschen der Wohnung aus dem Array


        if (nummer > anzWohnung || nummer < 0) {

            System.out.println("Nicht gültig, bitte erneut eingeben.");
        } else {
            Wohnung[] wohnungArrayCopy = new Wohnung[max_wohnung];
            int anzWohnungCopy = 0;
            for (int i = 0; i < anzWohnung; i++) {
                if (i != nummer) {
                    wohnungArrayCopy[anzWohnungCopy] = wohnungArray[i];
                    anzWohnungCopy++;
                }
            }
            wohnungArray = wohnungArrayCopy;
            anzWohnung = anzWohnungCopy;

        }
    }

    //Getter, Setter für die Wohnung
    public Wohnung getWohnung(int number) {
        // IF: Fehlerbehandlung, wenn zu löschende Nummer zu gross oder zu klein;
        // ELSE: rückgabe der Wohnung
        if (number > anzWohnung || number < 0) {
            System.out.println("Wohnung existiert nicht.");
            return null;
        } else {
            return wohnungArray[number];
        }


    }
    public void setWohnung(int number, Wohnung wohnung){
        wohnungArray [number] = wohnung;
    }

    //Getter für die Anzahl Wohnungen
    public int getAnzWohnung() {
        return anzWohnung;
    }
}