package uebungen;

import kapitel8.YearNotInRange;

public class Schaltjahr {

    public static void main(String[] args) {

        int jahr = 2000; //Integer.parseInt(args[0]);

        try {
            if (pruefeSchaltjahr(jahr)) {
                System.out.println("Das Jahr " + jahr +
                        " ist ein Schaltjahr.");
            } else {
                System.out.println("Das Jahr " + jahr +
                        " ist kein Schaltjahr.");
            }
            return;
        }catch (YearNotInRange e){
            System.out.println("Bitte geben Sie ein gültiges Jahr ein!");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (Exception e){
            System.out.println("Bitte geben Sie ein gültiges Jahr ein!");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("WIRKLICH Nichts führt an mir vorbei!");
        }
    }

    private static boolean pruefeSchaltjahr(int jahr) throws YearNotInRange {

        if(jahr < 1500 || jahr > 3000){
            throw new YearNotInRange(jahr);
        }


        // Prüfung auf Schaltjahr
        return (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0);

    }

}
