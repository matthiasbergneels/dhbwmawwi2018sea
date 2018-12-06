package kapitel7;

public class Hotel implements Bookable{

    private int roomsCount;
    private int bookedRoomsCount;

    public Hotel(int roomsCount){
        this.roomsCount = roomsCount;
        this.bookedRoomsCount = 0;
    }

    public void putzen(){
        System.out.println("Das Hotel wird geputzt...");
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
