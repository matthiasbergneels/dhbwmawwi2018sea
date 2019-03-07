package kapitel8;

public class YearNotInRange extends Exception{

    private int yearToCheck;

    public YearNotInRange(int yearToCheck){
        super("Year " + yearToCheck + " is not in range!");
        this.yearToCheck = yearToCheck;
    }



}
