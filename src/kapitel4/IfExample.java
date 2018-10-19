package kapitel4;

public class IfExample {

    public static void main(String[] args) {


        int speed = 80;
        boolean hasSpeedtrap = false;


        // Autofahren in der Ortschaft
        if(speed <= 50){
            System.out.println("Alles gut!");
            System.out.println("Fahr genau so weiter");
        }else if(hasSpeedtrap && speed > 50 && speed < 70){
            System.out.println("Zu schnell aber noch recht günstig!");
        }else if(hasSpeedtrap && speed > 70){
            System.out.println("Jetzt wirds teuer!");
        }else{
            System.out.println("Du bist zu schnell!");
        }

        System.out.println("Ende");


    }
}
