package kapitel12;

import kapitel9.Student;

public class LinkedListStudents {

    private StudentNode firstNode = null;
    private int size = 0;

    public void add(Student data){
        size++;
        if(firstNode == null){
            firstNode = new StudentNode(data);
            return;
        }

        StudentNode currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(new StudentNode(data));
    }

    public Student removeByStudentId(int studentId){
        if(firstNode == null){
            return null;
        }else{
            if(firstNode.getData().getStudentId() == studentId){
                Student data = firstNode.getData();
                firstNode = firstNode.getNextNode();
                size--;
                return data;
            }
            StudentNode currentNode = firstNode;
            while(currentNode.getNextNode() != null){
                if(currentNode.getNextNode().getData().getStudentId() == studentId){
                    Student data = currentNode.getNextNode().getData();
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    size--;
                    return data;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return null;
    }

    public int size(){
        return size;
    }

    public void printList(){
        if(firstNode == null){
            System.out.println("Liste ist leer");
            return;
        }

        StudentNode currentNode = firstNode;
        while(currentNode != null){
            Student student = currentNode.getData();
            System.out.println(student.getStudentId() + ": " + student.getFamilyName());
            currentNode = currentNode.getNextNode();
        }
    }

    public void printElements(){
        printElements(firstNode);
    }

    private void printElements(StudentNode currentNode){
        if(currentNode != null) {
            Student student = currentNode.getData();
            System.out.println(student.getStudentId() + ": " + student.getFamilyName());
            printElements(currentNode.getNextNode());
        }
    }



    private class StudentNode {
        private Student data;
        private StudentNode nextNode;

        public StudentNode(Student data){
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(StudentNode nextNode){
            this.nextNode = nextNode;
        }

        public StudentNode getNextNode() {
            return nextNode;
        }

        public Student getData(){
            return this.data;
        }
    }

    /*public void printListRec(){
        printListItem(firstNode);
    }

    private void printListItem(StudentNode currentNode){
        if(currentNode != null){
            Student student = currentNode.getData();
            System.out.println(student.getStudentId() + ": " + student.getFamilyName());
            printListItem(currentNode.getNextNode());
        }
    }*/
}
