package kapitel7;

public class Airplane implements Bookable{

    private boolean[][] seats;

    public Airplane(int rows, int seatsPerRow){
        seats = new boolean[rows][seatsPerRow];
    }


    public void fly(){
        System.out.println("Und ich flieg, flieg, flieg... *sing*");
    }

    @Override
    public int freePlaces() {
        return 0;
    }

    @Override
    public boolean book(int placesCount) {
        return false;
    }
}
