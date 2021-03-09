public class App {




    /**
     bis zu 50 Wohnungen erstellen

     jede Wohnung bis zu 15 Räume erfassen

     jeder Raum eingabe Länge, Breite, Namen

     jede Wohnung eine Übersicht mit quadratmeter für jeden raum + anzahl Räume + ganze wohnung

     Räume löschen

     Wohnungen löschen

     AUTHOR: Maruthan Thanabalasingam
     Date: 25.05.2020
     ***/



Hochhaus hochhaus;
Einleser einleser;

//Konstruktor
 public App (){
     hochhaus           = new Hochhaus();
     einleser           = new Einleser();
     wohnungMuster();
 }

 //Main methode
 public static void main(String[] args){
     App app            = new App();
     app.run();
 }


 //Run Methode
 public void run(){
     Einleser einleser = new Einleser();
     char auswahl =  ' ';

     while ( auswahl != 'x'){
         begruessen();

         auswahl = einleser.readChar();

         if (auswahl == 'a'){
             System.out.println("Wohnung anzeigen");
             wohnungAnzeigen();
         } else if (auswahl == 'b'){
             System.out.println("Wohnung erstellen");
             wohnungErstellen();
         } else if (auswahl == 'c'){
             System.out.println("Wohnung löschen");
             wohnungLoeschen();
         } else if (auswahl == 'd'){
             System.out.println("Raum erstellen");
             raumErstellen();
         } else if (auswahl == 'e'){
             System.out.println("Raum löschen");

             raumLoeschen();
         } else {
             System.out.println("Eingabe nicht erkannt.");
         }

         einleser.drawLine();
         System.out.println("Drücken Sie «h» um zum Hauptmenue zurück zu gelangen.");
         System.out.println("Drücken Sie «x» um das Programm zu beenden.");
         auswahl = einleser.readChar();
     }

     System.out.println("Auf Wiedersehen.");
     einleser.drawLine();


 }

//Zeigt die Wohnung mit den einzelnen Räumen an
 public void wohnungAnzeigen(){
     System.out.println("Bitte die Wohnungsnummer eingeben.");
    int nummer          = einleser.readInt();

        while (nummer> hochhaus.getAnzWohnung() || nummer<0) {
            System.out.println("Gültige nummer eingeben.");
            nummer      = einleser.readInt();
        }
        Wohnung wohnung = hochhaus.getWohnung(nummer);
        wohnung.showRaum(wohnung);
 }

 //Erstellt eine Wohnung
 public void wohnungErstellen(){
     System.out.println("Geben sie den Namen der Wohnung ein.");
     String name        = einleser.readString();
     Wohnung wohnung    = new Wohnung(name);
     hochhaus.addWohnung(wohnung);
     System.out.println("Wohnung erstellt.");
 }

 //Löscht eine Wohnunng
 public void wohnungLoeschen(){
     System.out.println("Welche Wohnung wollen sie löschen? Nummer angeben.");
     int nummer = einleser.readInt();
     hochhaus.removeWohnung(nummer);
     System.out.println("Ihre Wohnung wurde gelöscht.");
 }

//Erstellt einen Raum
 public void raumErstellen(){
     System.out.println("In welcher Wohnung möchten sie ein Raum erstellen.");
     int nummer = einleser.readInt();

     while (nummer> hochhaus.getAnzWohnung() || nummer<0) {
         System.out.println("Gültige nummer eingeben.");
         nummer         = einleser.readInt();
     }
     Wohnung wohnung    = hochhaus.getWohnung(nummer);
     System.out.println("Geben sie den Namen ein.");

     String name        = einleser.readString();

     System.out.println("Geben sie die Länge ein.");
     int laengeTemp      = einleser.readInt();

     double laenge = new Double(laengeTemp);

     System.out.println("Geben sie die Breite ein.");

     int breiteTemp      = einleser.readInt();

     double breite = new Double(breiteTemp);

     hochhaus.setWohnung(nummer,wohnung);



     Raum raum = new Raum(name,laenge,breite);

     wohnung.addRaum(raum);

     System.out.println("Raum "+ name + " erstellt.");
 }

//Löscht einen Raum
 public void raumLoeschen(){
     System.out.println("In welcher Wohnung ?");
     int nummer         = einleser.readInt();

     while (nummer> hochhaus.getAnzWohnung() || nummer<0) {
         System.out.println("Gültige nummer eingeben.");
         nummer         = einleser.readInt();
     }

     Wohnung wohnung = hochhaus.getWohnung(nummer);

     System.out.println("Welchen Raum ?. Die Nummer angeben.");

     Raum[] raumArray = wohnung.getRaumArray();


     int raumNummer = einleser.readInt();
     if (raumNummer>wohnung.getAnzRaum()){
         System.out.println("Nicht gültig.");
     }else {

         wohnung.removeRaum(raumNummer);
         String name = raumArray[raumNummer].getName();
         System.out.println("Raum " + name + " wurde gelöscht.");
     }
 }

//Anfangszustand
 public void wohnungMuster(){
     Wohnung wohnung1   = new Wohnung("Wohnung 1");
     wohnung1.addRaum(new Raum("Schlafzimmer",4,5));
     wohnung1.addRaum(new Raum("Küche",3,2));
     wohnung1.addRaum(new Raum("Wohnzimmer",3,2));
     wohnung1.addRaum(new Raum("Bad",2,2.5));

     Wohnung wohnung2 = new Wohnung("Wohnung 2 ");
     wohnung2.addRaum(new Raum("Schlafzimmer 1", 3,4));
     wohnung2.addRaum(new Raum("Schlafzimmer 2", 3,4));
     wohnung2.addRaum(new Raum("Schlafzimmer 3", 2.8,3.2));
     wohnung2.addRaum(new Raum("Buero", 2,3));
     wohnung2.addRaum(new Raum("Wohnzimmer und Kueche", 5,7));

     hochhaus.addWohnung(wohnung1);
     hochhaus.addWohnung(wohnung2);

 }

    //Intro
    private void begruessen() {
        String ausgabe = "WILLKOMMEN\n";
        ausgabe += "a = Wohnung anzeigen\n";
        ausgabe += "b = Wohnung erstelllen\n";
        ausgabe += "c = Wohnung löschen\n";
        ausgabe += "d = Raum erstellen\n";
        ausgabe += "e = Raum löschen\n";
        System.out.println(ausgabe);
    }
}
