package kapitel3;

public class ArrayExample {

    public static void main(String[] args) {

        // Array Deklaration & Initialisiert mit Literal
        // Indizes      0   1   2   3     4    5
        int[] zahlen = {16, 78, 89, 1627, 562, 561};

        System.out.println(zahlen[2]);

        String[] textBlocks;

        textBlocks = new String[10];

        textBlocks[0] = "Herzlich Willkommen";
        textBlocks[1] = "Auf Wiedersehen";
        textBlocks[2] = "Hallo";

        // ArrayIndexOutOfBoundsException
        //textBlocks[15] = "Shit";

        System.out.println("Anzahl Elemente: " + textBlocks.length);


        char[][] ticTacToeField = new char[3][3];

        ticTacToeField[1][1] = 'X';
        ticTacToeField[0][2] = 'O';

        int[][][] numberCluster = new int[3][][];

        numberCluster[0] = new int[5][];

        numberCluster[0][0] = new int[10];
        numberCluster[0][1] = new int[3];
        numberCluster[0][2] = new int[5];

        System.out.println("Elemente in numberCluster: " + numberCluster.length);
        System.out.println("Elemente in numberCluster[0]: " + numberCluster[0].length);
        System.out.println("Elemente in numberCluster[0][1]: " + numberCluster[0][1].length);


    }
}
