package kapitel5;

public class CarTest {

    public static void main(String[] args) {


        byte number = 4;


        System.out.println("Es gibt " +  Car.getCarCounter() + " Autos.");

        Car myCar = new Car(Car.Colors.GRUEN, 150, "HD-XX 1234", "BMW");
        Car car01 = new Car(Car.Colors.GRUEN, 150, "HD-XX 1234", "BMW");
        Car car02 = new Car(Car.Colors.GRUEN, 150, "HD-XX 1234", "BMW");

        /* Initialisiert durch Konstruktor
        myCar.color = "lila";
        myCar.licensePlate = "HD-XX 1234";
        myCar.hp = 124;
        myCar.brand = "BMW";
        */

        myCar.setColor(Car.Colors.LILA);

        Car yourCar = new Car(Car.Colors.ROT, -99, "MA-YY 6789", "Fiat");

        yourCar.setColor(Car.Colors.SCHWARZ);
        //yourCar.setHp(-99);

        /* Initialisiert durch Konstruktor
        yourCar.color = "blau";
        yourCar.licensePlate = "MA-YY 6789";
        yourCar.hp = 90;
        yourCar.brand = "Fiat";
        */

        System.out.println("Farbe von myCar: " + myCar.getColor());
        System.out.println("Nummernschild von myCar: " + myCar.getLicensePlate());

        System.out.println("Farbe von yourCar: " + yourCar.getColor());
        System.out.println("Nummernschild von yourCar: " + yourCar.getLicensePlate());

        myCar.accelerate(50);
        myCar.accelerate(30);

        System.out.println("Aktuelle Geschwindigkeit von myCar: " + myCar.getCurrentSpeed());

        myCar.brake(35);

        System.out.println("Aktuelle Geschwindigkeit von myCar: " + myCar.getCurrentSpeed());

        System.out.println("Aktuelle Geschwindigkeit von yourCar: " + yourCar.getCurrentSpeed());

        System.out.println("Es gibt " +  Car.getCarCounter() + " Autos.");


        // Verschrotten

        car01 = null;
        car02 = null;


        System.gc();

        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }

        System.out.println("Es gibt " +  Car.getCarCounter() + " Autos.");
    }
}
