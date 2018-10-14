package kapitel3;

public class LiteralsExampel {

    public static void main(String[] args){

        // Dezimal-Literal
        int numberA = 50;
        byte numberD = 50;

        // Oktal-Literal
        numberA = 032; // ==> Dezimal: 26

        // Hex-Literal
        numberA = 0x5A; // ==> Dezimal: 90

        System.out.println(numberA);

        // Fliesskomma-Literale

        double numberB = .14;

        float numberC = 6.15f;

        // Zeichen-Literale

        // Char-Literal
        char sign01 = 'g';
        System.out.println(sign01);

        sign01 = '\u2764';
        System.out.println(sign01);

        // Zeichenketten
        String myText = "Hier steht mein \"Text\" \u2764";

        System.out.println(myText);

    }
}
