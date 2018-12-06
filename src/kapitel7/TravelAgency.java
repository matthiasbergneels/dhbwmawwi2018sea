package kapitel7;

public class TravelAgency {

    public static void main(String[] args) {

        // narrowing Cast
        Bookable[] bookableObjects = {
                new Hotel(20),
                new Airplane(12, 4),
                new Airplane(5, 3),
                new Hotel(70)
        };

        int count = 0;
        for(Bookable bookableObject : bookableObjects){
            System.out.println("Buchbares Objekt: " + count++);
            System.out.println("Freie Plätze: " + bookableObject.freePlaces());
            System.out.println("Buchen: " + bookableObject.book(21));
            System.out.println("Freie Plätze: " + bookableObject.freePlaces());

            if(bookableObject instanceof Airplane){
                Airplane myAirplane = (Airplane)bookableObject;
                myAirplane.fly();
            }else if(bookableObject instanceof Hotel){
                Hotel myHotel = (Hotel)bookableObject;
                myHotel.putzen();
                System.out.println(myHotel instanceof Bookable);
            }
        }


    }
}
