package kapitel9;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> studentList = new TreeSet<String>();


        studentList.add("Gabi");
        studentList.add("Klaus");
        studentList.add("Alfred");
        studentList.add("zeus");
        studentList.add("Gabi");


        System.out.println("Ausgabe - for-each");
        for(String student : studentList){
            System.out.println(student);
        }

    }
}
