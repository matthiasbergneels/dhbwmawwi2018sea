package kapitel11;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class FileHandler {
    public static void main(String[] args) {

        /*
        Map systemProperties = System.getProperties();

        Set propertyKeys = systemProperties.keySet();

        for(Object key : propertyKeys){
            System.out.println(key + ": " + systemProperties.get(key));
        }
        */

        File myTextFile = new File("myTextFile.txt");

        if(!myTextFile.exists()){
            try {
                myTextFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try (FileWriter myFileWriter = new FileWriter(myTextFile, false)) {

            myFileWriter.write("Erster Text\n");
            myFileWriter.write("Zweiter Text\n");

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader myFileReader = new FileReader(myTextFile); BufferedReader myLineReader = new BufferedReader(myFileReader)){

            String line;
            while((line = myLineReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
