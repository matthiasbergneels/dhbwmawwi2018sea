package kapitel4;

public class SwitchExample {

    public static void main(String[] args) {

        int grade = 7;

        switch(grade){
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Ungenügend");
                break;
        }



        String trafficLight = "gelb";

        switch(trafficLight){
            case "grün":
                System.out.println("Fahren");
                break;
            case "rot":
            case "gelb":
                System.out.println("Anhalten");
        }

    }
}
