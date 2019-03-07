package uebungen;

public class TestSpiele {

    public static void main(String[] args) {

        Gesellschaftsspiel[] spiele = new Gesellschaftsspiel[3];

        spiele[0] = new Kartenspiel("Uno", 5, 64);
        spiele[1] = new Kartenspiel("Skat", 3, 32);
        spiele[2] = new Brettspiel("Mensch ärgere dich nicht", 4, 16);

        //spiele[0].zieheKarte();

        for(Gesellschaftsspiel spiel : spiele){
            spiel.spielen();

            if(spiel instanceof Kartenspiel){
                ((Kartenspiel)spiel).zieheKarte();
            }

        }
    }
}
