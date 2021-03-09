public class Schulhaus {


    Schulklasse[] schulhausArray = new Schulklasse[15];
    int anzSchulklassen = 0;


    public void addSchulklasse(Schulklasse schulklasse){
        schulhausArray[anzSchulklassen] = schulklasse;
        anzSchulklassen++;
    }


    public void setSchulhausArray(Schulklasse[] schulhausArray) {
        this.schulhausArray = schulhausArray;
    }

    public int getAnzSchulklassen() {
        return anzSchulklassen;
    }

}

