package kapitel12;

public class LinkedListTest{

    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.add(16);
        numberList.add(67);
        numberList.add(99);
        numberList.add(27);


        System.out.println("Anzahl Elemente: " + numberList.size());


        numberList.printList();

        numberList.remove(99);
        numberList.remove(77);

        System.out.println("Anzahl Elemente: " + numberList.size());


        numberList.printList();


        LinkedList<String> wordList = new LinkedList<>();

        wordList.add("Hallo");
        wordList.add("meine");
        wordList.add("Freunde");

        wordList.remove("meine");

        wordList.printList();

    }
}
