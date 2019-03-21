package kapitel9;

import java.util.ArrayList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {

        List studentList = new ArrayList();


        studentList.add("Karl");
        studentList.add("Gabi");
        studentList.add("Fritz");

        System.out.println("Anzahl Studierende: " + studentList.size());

        studentList.remove(2);

        studentList.add("Michael");
        studentList.add("Claudia");
        studentList.add("Franz");
        studentList.add("Gabi");

        System.out.println("Anzahl Studierende: " + studentList.size());

        studentList.add(2, "Heide");

        System.out.println("Index von Gabi: " + studentList.indexOf("Gabi"));
        studentList.remove("Gabi");
        System.out.println("Index von Gabi: " + studentList.indexOf("Gabi"));

        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

    }
}
