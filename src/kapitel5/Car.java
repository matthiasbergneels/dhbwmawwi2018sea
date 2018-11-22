package kapitel5;

public class Car {

    private Colors color;
    private int hp;
    private String licensePlate;
    private String brand;
    private double currentSpeed;


    private static int carCounter;


    enum Colors{
        SCHWARZ, ROT, LILA, BLAU, GRUEN
    }


    Car(Colors color, int hp, String licensePlate, String brand){
        this.setColor(color);
        this.setHp(hp);
        this.setLicensePlate(licensePlate);
        this.setBrand(brand);

        this.currentSpeed = 0.0;
        carCounter++;

    }

    public Colors getColor(){
        return color;
    }

    public String getBrand(){
        return brand;
    }

    public int getHp() {
        return hp;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setColor(Colors color){
        this.color = color;
    }

    public void setHp(int hp) {
        if(hp > 25 && hp < 500){
            this.hp = hp;
        }else{
            this.hp = 75;
        }
    }

    private void setBrand(String brand){
        this.brand = brand;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    void accelerate(double speed){
        currentSpeed = currentSpeed + speed;
    }

    void brake(double speed){
        currentSpeed = currentSpeed - speed;
    }

    double howFastIsOurCar(){
        return currentSpeed;
    }

    public static int getCarCounter(){
        return carCounter;
    }

    protected void finalize(){
        carCounter--;
        System.out.println("Auto wird verschrottet!");
    }

}
