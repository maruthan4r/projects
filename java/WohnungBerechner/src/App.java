import java.util.Scanner;

public class App {



    /**
     bis zu 50 Wohnungen erstellen
     jede Wohnung bis zu 15 Räume erfassen
     jeder Raum eingabe Länge, Breite, Namen
     jede Wohnung eine Übersicht mit quadratmeter für jeden raum + + anzahl Räume + ganze wohnung
     Räume löschen
    Wohnungen löschen

     AUTHOR: Maruthan Thanabalasingam
     Date: 25.05.2020
     ***/


    //DEKLARATION
            int anzWohnungen = 0;
            Wohnung[] wohnungArray = new Wohnung[50];
            Einleser einleser = new Einleser();
            Scanner scanner = new Scanner(System.in);

            public App(){
                Raum raum = new Raum();
                Wohnung wohnung = new Wohnung();
            }


    public static void main(String[] args){
        App app = new App();
        app.run();

    }











    public void run(){
        Wohnung[] wohnungArray = new Wohnung[50];
        int anzWohnungen = 0;


        Wohnung wohnung1 = new Wohnung("Wohnung 1");
        Wohnung wohnung2 = new Wohnung("Wohnung 2");

        addWohnung(wohnung1);
        addWohnung(wohnung2);

        wohnung1.addRaum(new Raum("Schlafzimmer",4,5));
        wohnung1.addRaum(new Raum("Küche",3,2));
        wohnung1.addRaum(new Raum("Wohnzimmer",3,2));
        wohnung1.addRaum(new Raum("Bad",2,2.5));

        wohnung2.addRaum(new Raum("Schlafzimmer 1", 3,4));
        wohnung2.addRaum(new Raum("Schlafzimmer 2", 3,4));
        wohnung2.addRaum(new Raum("Schlafzimmer 3", 2.8,3.2));
        wohnung2.addRaum(new Raum("Buero", 2,3));
        wohnung2.addRaum(new Raum("Wohnzimmer und Kueche", 5,7));

        addWohnung(wohnung1);
        addWohnung(wohnung2);

        String test = wohnungArray[0].getName();


        System.out.println(test);
/**
 System.out.println("Willkommen im Wohnungsplaner.");
 System.out.println("a=Wohnung erstellen");
 System.out.println("b=Wohnung anzeigen");
 System.out.println("c=Wohnung löschen");
 System.out.println("d=Programm Beenden");
 System.out.println("j=Hauptmenü");



 char eingabe = einleser.readChar();

 while (eingabe!='d'){


 switch (eingabe){
 case 'a' : {
 //WOHNUNG ERSTELLEN
 System.out.println("Geben sie den Namen der Wohnung ein.");
 String eingabeTemp1 = einleser.readString();
 Wohnung wohnungTemp1 = new Wohnung(eingabeTemp1);
 addWohnung(wohnungTemp1);
 System.out.println("j = Hauptmenue");
 System.out.println("d = Programm beenden");

 eingabe = einleser.readChar();
 }

 case 'b' : {

 //WOHNUNG ANZEIGEN
 System.out.println("Welche Wohnung?");
 int wohnungNummerTemp = readArrayInt();



 Wohnung wohnungTemp;
 wohnungTemp             = wohnungArray[wohnungNummerTemp];

 wohnungTemp             = wohnungArray[wohnungNummerTemp];

 double flaeche          = wohnungTemp.wohnungsFlaecheberechnen();

 String name             = wohnungTemp.getName();

 Raum[] raumArrayTemp    = new Raum[15];

 raumArrayTemp    =  wohnungTemp.getRaumArray();





 System.out.println("Name : "+name);
 System.out.println("Fläche: "+ flaeche + " quadratmeter.");

 for (int i = 0 ; i<raumArrayTemp.length;i++){

 String raumName     = raumArrayTemp[i].getName();
 double raumLaenge   = raumArrayTemp[i].getLaenge();
 double raumBreite   = raumArrayTemp[i].getBreite();
 double raumFlaeche  = raumBreite*raumLaenge;


 System.out.println(", Länge: "+ raumLaenge+  " Breite: "+ raumBreite+  ", Fläche: "+flaeche+" Quadratmeter" );

 }
 eingabe = einleser.readChar();
 }

 default:{
 System.out.println("Alles Klar");
 eingabe = einleser.readChar();
 }
 }
 }
 System.out.println("Auf wiedersehen.");


 */








    }


    public void addWohnung(Wohnung wohnung) {wohnungArray[anzWohnungen] = wohnung; anzWohnungen++;}

    public double berechnen(double laenge, double breite){ double flaeche=0; flaeche = laenge*breite; return flaeche;}

    public int readArrayInt() {
        einleser.drawLine();
        System.out.print("> ");
        while (!scanner.hasNextInt()||scanner.nextInt()<0) {
            scanner.next();
            System.out.println("Bitte eine Ganzzahl eingeben!");
            einleser.drawLine();
            System.out.print("> ");
        }
        int zahl = scanner.nextInt();
        scanner.nextLine();  // Scanner leeren, damit er für die nächste Operation frei ist.
        einleser.drawLine();
        return zahl;

    }



}
