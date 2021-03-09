public class Garage {

    Auto[] abstellplatz = new Auto[100];
    int anzAuto = 0;




    public void addAuto(Auto auto){
        abstellplatz[anzAuto] = auto;
        anzAuto++;
    }

    public void autoSchrotten(int number){
        Auto[] abstellplatzCopy = new Auto[100];

        for (int i = 0; i<number;i++){
            abstellplatzCopy[i] = abstellplatz[i];
        }


    }


}
