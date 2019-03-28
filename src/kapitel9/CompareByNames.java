package kapitel9;

import java.util.Comparator;

public class CompareByNames implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getFamilyName().compareTo(o2.getFamilyName()) != 0){
            return o1.getFamilyName().compareTo(o2.getFamilyName());
        }

        if(o1.getName().compareTo(o2.getName()) != 0){
            return o1.getName().compareTo(o2.getName());
        }

        return o1.getAge() - o2.getAge();
    }
}
