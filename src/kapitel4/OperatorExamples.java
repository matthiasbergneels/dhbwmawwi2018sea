package kapitel4;

public class OperatorExamples {

    public static void main(String[] args) {


        int numberA = 5;
        int numberB = 10;

        int numberResult;

        // gleich: numberA = numberA + 1;
        // numberA++;

        // Compiler (Präinkrement):
        // 1. ++numberA ==> zwischenErgebnis und weise numberA zu
        // 2. zwischenErgebnis aus 1. * numberB ==> zwischenErgebnis
        // 3. weise zwischenErgebnis aus 2. numberResult zu
        numberResult = ++numberA * numberB;


        // Compiler (Postinkrement):
        // 1. numberA * numberB ==> zwischenErgebnis
        // 2. weise zwischenErgebnis aus 1. numberResult zu
        // 3. numberA um eins erhöht ==> und weise es numberA zu
        numberResult = numberA++ * numberB;


        System.out.println("Ergebnis von numberA * numberB: " + numberResult);
        System.out.println("NumberA: " + numberA);
        System.out.println("NumberB: " + numberB);



        // gleich: numberA = numberA + numberB;
        numberA += numberB;


        // ?-Operator
        boolean isTired = false;

        String condition = isTired ? "Müde" : "Wach";

        System.out.println(condition);

        int ggt1 = 68;
        int ggt2 = 672;

        //int result = (ggt1 > ggt2) ? (ggt1 = ggt1-ggt2) : (ggt2 = ggt2-ggt1);



        // String Verkettung mit +

        String greeting = "Herzlich Willkommen";
        String name = "Klaus";

        String myText = ggt1 + ( ggt2 + greeting )  + " " + name + '!' + " " + (ggt1 + ggt2);

        System.out.println(myText);
    }

}
