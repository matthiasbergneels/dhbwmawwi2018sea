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
        return roomsCount - bookedRoomsCount;
    }

    @Override
    public boolean book(int placesCount) {
        if(placesCount > freePlaces()){
            return false;
        }else{
            bookedRoomsCount = bookedRoomsCount + placesCount;
        }
        return true;
    }
}
