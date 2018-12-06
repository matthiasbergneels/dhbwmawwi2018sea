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
        // false = frei; true = besetzt
        int count = 0;
        for(boolean[] row : seats){
            for(boolean seat : row){
                if(!seat){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public boolean book(int placesCount) {
        if(placesCount > freePlaces()){
            return false;
        }else{
            for(int i = 0; i < seats.length; i++){
                for(int j = 0; j < seats[i].length; j++){
                    if(placesCount > 0 && !seats[i][j]){
                        seats[i][j] = true;
                        placesCount--;
                    }
                }
            }
            return true;
        }
    }
}
