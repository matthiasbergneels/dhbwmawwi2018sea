package kapitel3;

public class TypConversionExample {

    public static void main(String[] args){
        byte numberA = 40;
        int numberB;

        // implizite Konvertierung
        numberB = numberA;

        // explizite Konvertierung mit Typ-Cast
        numberB = 129;
        numberA = (byte)numberB;

        System.out.println(numberA);



        double numberC = 3.54;

        numberA = (byte)numberC;

        System.out.println(numberA);


        char sign01 = '\u2764';

        numberB = sign01;

        System.out.println(numberB);
    }




}
