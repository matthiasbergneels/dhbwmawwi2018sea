package kapitel9;

import java.util.*;

public class SetStudentExample {

    public static void main(String[] args) {
        Set<Student> studentList = new TreeSet<Student>();
        Set<Student> studentList2 = new TreeSet<Student>(new CompareByNames());

        Student s1 = new Student(6372, "Gabi", "Mueller", 23);
        Student s2 = new Student(6372, "Franz", "Fischer", 27);

        System.out.println(s1.equals(s2));

        studentList.add(s1);
        studentList.add(new Student(8726, "Michael", "Halbleiter", 28));
        studentList.add(new Student(8921, "Michael", "Halbleiter", 27));
        studentList.add(new Student(7283, "Zeus", "Gottheit", 99));
        studentList.add(s2);
        studentList.add(new Student(9178, "Schantalle", "Wollny", 19));
        studentList.add(new Student(9178, "Fritz", "Wollny", 19));

        System.out.println("Ausgabe - Iterator");
        Iterator<Student> i = studentList.iterator();
        while(i.hasNext()){
            Student student = i.next();
            System.out.println(student.getStudentId() + ": " + student.getFamilyName() + ", " + student.getName());
        }

        studentList2.addAll(studentList);

        List<Student> studentList3 = new ArrayList<Student>(studentList);

        System.out.println("Ausgabe - Liste:");
        for(Student student : studentList3){
            System.out.println(student.getStudentId() + ": " + student.getFamilyName() + ", " + student.getName());
        }


        studentList3.add(new Student(9178, "Fritz", "Wollny", 19));
        Collections.sort(studentList3, new CompareByNames());
        System.out.println("Ausgabe - Liste sortiert nach Namen:");
        for(Student student : studentList3){
            System.out.println(student.getStudentId() + ": " + student.getFamilyName() + ", " + student.getName());
        }

    }
}
