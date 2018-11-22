package kapitel5;

public class Student {

    private int matrikelNo;
    private String lastName;
    private String name;


    public Student(int matrikelNo, String lastName, String name) {
        this.matrikelNo = matrikelNo;
        this.lastName = lastName;
        this.name = name;
    }


    public void drink(float amount){
        System.out.println("The student drinks " + amount + " l");
    }

    public void drink(float amount, float alcohol){
        drink(amount);
        if(alcohol < 5.5){
            System.out.println("The student gets drunk!");
        }else{
            System.out.println("The student gets really drunk!");
        }

    }

    public int getMatrikelNo() {
        return matrikelNo;
    }

    public void setMatrikelNo(int matrikelNo) {
        this.matrikelNo = matrikelNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
