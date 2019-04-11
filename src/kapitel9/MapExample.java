package kapitel9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<Integer, Student>();

        Student s1 = new Student(6273, "Gabi", "Mueller", 23);

        students.put(s1.getStudentId(), s1);
        students.put(8293, new Student(8293, "Franz", "Faerber", 33));
        students.put(8201, new Student(8201, "Michaela", "Faerber", 28));

        System.out.println("Studierende: " + students.size());


        Student student = students.get(6273);
        System.out.println(student.getFamilyName());

        Set<Integer> studentIds = students.keySet();

        Iterator<Integer> i = studentIds.iterator();
        while(i.hasNext()){
            Student s2 = students.get(i.next());
            System.out.println(s2.getStudentId() + ": " + s2.getFamilyName() + ", " + s2.getName());
        }

    }
}
