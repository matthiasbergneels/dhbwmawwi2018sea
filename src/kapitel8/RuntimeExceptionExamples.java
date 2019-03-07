package kapitel8;

public class RuntimeExceptionExamples {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int a = 5;
        int b = 0;


        for(int i = 0; i < numbers.length; i++){
            try {

                System.out.println(numbers[i]);

                if((i-7) != 0 ){
                    int result = a / (i-7);
                    System.out.println(result);
                }else{
                    // User darauf hinweisen
                }

            }catch(ArrayIndexOutOfBoundsException arrayOutOfBounds){
                System.out.println("Da ist ein Problem!");

            }catch(ArithmeticException arithmetic){
                System.out.println("Du bist nicht Chuck Norris!");
            }
        }

        System.out.println("Programm Ende!");

    }
}
