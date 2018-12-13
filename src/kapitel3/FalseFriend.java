package kapitel3;

public class FalseFriend {

    public static void main(String[] args) {

        String text1 = "Baum";
        String text2 = new String("Baum");

        //text1 = text2;

        System.out.println(text1);
        System.out.println(text2);

        if(text1 == text2){
            System.out.println("Baum = Baum");
        }else{
            System.out.println("Baum != Baum");

        }

    }
}
