public class Rezept {

    String name;
    int anzahlZutaten=0;
    Lebensmittel[] zutaten = new Lebensmittel[10];


    public Rezept (String name){

        this.name = name;
    }


    public void lebensmittelerfassen(String name, String einheit, double menge) {
        Lebensmittel lebensmittel = new Lebensmittel(name, einheit, menge);
        zutaten[anzahlZutaten] = lebensmittel;
        anzahlZutaten++;


    }
/**
    public void rezeptAusdrucken() {
    for (int i =0;i<anzahlZutaten;) {
        System.out.println(name);
        System.out.print(" "+zutaten[i].getMenge());
        System.out.print(" "+zutaten[i].getEinheit());
        System.out.print(" " + zutaten[i].getName());
        System.out.println("-");
        i++;
    }**/

        public void rezeptAusdrucken() {
            System.out.println(name);
            for (int i =0;i<anzahlZutaten;) {
                System.out.println(" " + zutaten[i].getMenge() + " " + zutaten[i].getEinheit() + " " + zutaten[i].getName());
                i++;
            }
            System.out.println("-");
        }


}
