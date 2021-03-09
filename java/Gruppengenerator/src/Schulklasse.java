public class Schulklasse {

    String name;
    Schueler[] schuelerArray = new Schueler[25];


    public Schulklasse(String name, Schueler[] schuelerArray){
        this.name = name;
        this.schuelerArray = schuelerArray;
    }


    public void showGroups(int groesse){

        Schueler[] gruppe = new Schueler[groesse];

        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchuelerArray(Schueler[] schuelerArray) {
        this.schuelerArray = schuelerArray;
    }

    public Schueler[] getSchuelerArray() {
        return schuelerArray;
    }


}

