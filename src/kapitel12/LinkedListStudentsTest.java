package kapitel12;

import kapitel9.Student;

public class LinkedListStudentsTest {

    public static void main(String[] args) {

        LinkedListStudents studentList = new LinkedListStudents();

        studentList.add(new Student(5678, "Klaus", "Mueller", 35));
        studentList.add(new Student(5678, "Klaus", "Mueller", 35));
        studentList.add(new Student(5678, "Klaus", "Mueller", 35));


        System.out.println("Aktuelle Listenlaenge: " + studentList.size());

        studentList.removeByStudentId(5678);
        studentList.removeByStudentId(1234);

        System.out.println("Aktuelle Listenlaenge: " + studentList.size());

        System.out.println("Iterate:");
        studentList.printList();

        System.out.println("Recursive:");
        studentList.printElements();


    }


}
