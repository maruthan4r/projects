public class Kochbuch {

    public static void main(String[] args){
        Rezept bananaShake = new Rezept("Banana Shake");
        bananaShake.lebensmittelerfassen("Banane","Gramm",100);
        bananaShake.lebensmittelerfassen("Milch","Mililiter",150);
        bananaShake.lebensmittelerfassen("Vanille-Eis","Mililiter",150);

        bananaShake.rezeptAusdrucken();

        Rezept erdbeerkuchen = new Rezept("Erdbeerkuchen");
        erdbeerkuchen.lebensmittelerfassen("erdbeere","gramm",100);
        erdbeerkuchen.lebensmittelerfassen("Kuchen","gramm",100);
        erdbeerkuchen.lebensmittelerfassen("Milch","Liter",1);


        erdbeerkuchen.rezeptAusdrucken();

        Rezept schokoMuffin = new Rezept("Schokomuffin");
        schokoMuffin.lebensmittelerfassen("schokolade","Tafel",1);
        schokoMuffin.lebensmittelerfassen("Muffin","Stueck",1);
        schokoMuffin.lebensmittelerfassen("Milch","Glas",1);

        schokoMuffin.rezeptAusdrucken();






    }
}
