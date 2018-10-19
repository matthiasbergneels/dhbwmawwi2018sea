package kapitel4;

public class LoopExamples {
    public static void main(String[] args) {


        int counter = 0;

        while(counter <= 9 ){

            if(counter == 5){
                System.out.println("Böse Zahl!");
                break;
            }
            System.out.println("kopfgesteuer... " + counter++);
            //counter++;
        }

        System.out.println("Aktueller Stand von Counter: " + counter);


        counter = 0;

        do{
            System.out.println("fußgesteuer... " + counter);
        }while(++counter <= 9);

        System.out.println("Aktueller Stand von Counter: " + counter);


        for(int i = 0; i <= 9; i++){
            if(i%3 == 0){
                continue;
            }
            System.out.println("zählergesteuert... " + i);

        }
    }
}
