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
        bello.atmen();

        nemo.blubbern();
        nemo.bewegen();
        nemo.fressen();
        nemo.atmen();
        
        
        // Narrowing Cast
        Tier einTier = bello;
        
        einTier.bewegen();
        einTier.fressen();
        einTier.atmen();
        //einTier.bellen();
        
        // Narrowing Cast
        einTier = nemo;
        
        einTier.bewegen();
        einTier.fressen();
        einTier.atmen();
        //einTier.blubbern();
        
        // Narrowing Cast
        Object tiereSindObjekte = bello;
        
        System.out.println(tiereSindObjekte.toString());

        
        Tier[] tierboxen = new Tier[4];
        
        tierboxen[0] = bello;
        tierboxen[1] = nemo;
        tierboxen[2] = new Hund(15.0f, 30.0f, "Benno", "Schäferhund");
        tierboxen[3] = new Fisch(5.0f, 3.5f, "Marlene", false);
        
        for(Tier aktuellesTier : tierboxen){
            aktuellesTier.bewegen();
            aktuellesTier.atmen();
            aktuellesTier.fressen();
            
            if(aktuellesTier instanceof Hund){
                Hund einHund = (Hund)aktuellesTier;
                einHund.bellen();
            }
            
        }
        
        // Widening Cast
        Hund einHund = (Hund)tiereSindObjekte;
        
        System.out.println(bello);
        System.out.println(nemo);
    }
}
