package kapitel7.clone;

public class CloneMachine {

    public static void main(String[] args) {

        Sheep dolly = new Sheep(100, 70, "Dolly", 5);

        try {
            Sheep cloneDolly = dolly.clone();

            System.out.println("Schaf 0 : " + dolly);
            System.out.println("Schaf 1 (clone) : " + cloneDolly);
        }catch(Exception e){
            System.out.println("Clonen ist schief gegangen - beide Schafe tot!");
        }
    }
}
