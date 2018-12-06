package kapitel7.clone;

import kapitel7.Bookable;
import kapitel6.Tier;

public class Sheep extends Tier implements Cloneable, Bookable{

    private int age;

    public Sheep(float gewicht, float groesse, String bezeichnung, int age) {
        super(gewicht, groesse, bezeichnung);
        this.age = age;
    }



    @Override
    public void atmen() {
        System.out.println("Das Schaf atmet!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Alter " + age;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep)super.clone();
        clone.age = 0;
        clone.setBezeichnung(clone.getBezeichnung() + " Clone");
        return clone;
    }

    @Override
    public int freePlaces() {
        return 0;
    }

    @Override
    public boolean book(int placesCount) {
        return false;
    }
}
