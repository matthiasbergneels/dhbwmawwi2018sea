package kapitel6;

public class Bauernhof {

    public static void main(String[] args) {

        Hund bello = new Hund(15.0f, 30.0f, "Bello", "Dogge");

        // Tier einTier = new Tier(10.0f, 5.0f, "unspezifisches Tier");

        Fisch nemo = new Fisch(5.0f, 3.5f,"Nemo", false);


        bello.bellen();
        bello.bewegen();
        bello.fressen();
        bello.fressen(1.5f);
        bello.atmet();

        nemo.blubbern();
        nemo.bewegen();
        nemo.fressen();
        nemo.atmet();


        System.out.println(bello);
        System.out.println(nemo);
    }
}
