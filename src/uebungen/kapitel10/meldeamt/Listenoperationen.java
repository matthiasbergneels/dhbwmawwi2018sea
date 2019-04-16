package uebungen.kapitel10.meldeamt;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class Listenoperationen {

    private static final String FILENAME = "EinwohnerListe.txt";
    private static TreeSet<Einwohner> liste = new TreeSet<Einwohner>();

    private static Einwohner ermittleObjekt(String name, String vorname){
        Einwohner e = null;

        Iterator<Einwohner> i = liste.iterator();
        while(i.hasNext()){
            e = i.next();
            if((name.equals(e.getName()) &&
                    vorname.equals(e.getVorname()))){
                return e;
            }
        }

        return null;
    }

    public static boolean hinzufuegen(String name, String vorname, String gebName, String email, String anrede, String familienstand){
        Einwohner e = new Einwohner(name, vorname, gebName, email, anrede, familienstand);
        boolean erg = liste.add(e);
        return erg;
    }

    public static boolean anzeigen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            System.out.println(e);
            return true;
        }
    }

    public static boolean suchen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            //System.out.println(e);
            return true;
        }
    }

    public static boolean loeschen(String name, String vorname){
        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            liste.remove(e);
            return true;
        }
    }

    public static void listeAusgeben(){
        if(liste.size() > 0){

            Einwohner e = null;

            System.out.println("Einwohner:");

            Iterator<Einwohner> i = liste.iterator();
            while(i.hasNext()){
                System.out.println(i.next());

            }
        }else{
            System.out.println("Die Liste ist leer!");
        }
    }

    public static void persistTreeSetToFile(){

        File einwohnerFile = new File(FILENAME);
        if(!einwohnerFile.exists()){
            try {
                einwohnerFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(FileOutputStream einwohnerFileOutputStream = new FileOutputStream(einwohnerFile);
            ObjectOutputStream einwohnerObjectOutputStream = new ObjectOutputStream(einwohnerFileOutputStream)){

            einwohnerObjectOutputStream.writeObject(liste);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try(FileWriter einwohnerFileWriter = new FileWriter(einwohnerFile)){

            Iterator<Einwohner> einwohnerIterator = liste.iterator();
            while(einwohnerIterator.hasNext()){
                String einwohnerZeile = "";
                Einwohner einwohner = einwohnerIterator.next();

                einwohnerZeile += einwohner.getName() + ";";
                einwohnerZeile += einwohner.getVorname() + ";";
                einwohnerZeile += einwohner.getGebName() + ";";
                einwohnerZeile += einwohner.getAnrede() + ";";
                einwohnerZeile += einwohner.getEmail() + ";";
                einwohnerZeile += einwohner.getFamilienstand() + ";";
                einwohnerZeile += einwohner.hashCode() + "\n";

                einwohnerFileWriter.write(einwohnerZeile);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }

    public static void readTreeSetFromFile(){
        File einwohnerFile = new File(FILENAME);
        if(einwohnerFile.exists()){

            try(FileInputStream einwohnerFileInputStream = new FileInputStream(einwohnerFile);
                ObjectInputStream einwohnerObjectInputStream = new ObjectInputStream(einwohnerFileInputStream)){

                liste = (TreeSet<Einwohner>)einwohnerObjectInputStream.readObject();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            /*
            try(FileReader einwohnerFileReader = new FileReader(einwohnerFile);
                    BufferedReader einwohnerReader = new BufferedReader(einwohnerFileReader)){

                String einwohnerZeile;
                while((einwohnerZeile = einwohnerReader.readLine()) != null){
                    String[] einwohnerSpalten = einwohnerZeile.split(";");

                    Listenoperationen.hinzufuegen(einwohnerSpalten[0],
                                                    einwohnerSpalten[1],
                                                    einwohnerSpalten[2],
                                                    einwohnerSpalten[4],
                                                    einwohnerSpalten[3],
                                                    einwohnerSpalten[5]);

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            */

        }
    }
}