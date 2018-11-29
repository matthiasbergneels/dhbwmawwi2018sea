package kapitel6;

import kapitel6.Tier;

public class Fisch extends Tier{

    private boolean knorpelfisch;

    public Fisch(float groesse, float gewicht, String bezeichnung, boolean knorpelfisch){
        super(gewicht, groesse, bezeichnung);
        setKnorpelfisch(knorpelfisch);
    }

    public void blubbern(){
        System.out.println("Der Fisch " + this.getBezeichnung() + " blubbert!");
    }

    @Override
    public void atmet() {
        System.out.println("Der Fisch " + getBezeichnung() + " atment - *blubber*");
    }

    @Override
    public void fressen() {
        super.fressen();
        System.out.println("jedemenge Algen!");
    }

    public boolean isKnorpelfisch() {
        return knorpelfisch;
    }

    public void setKnorpelfisch(boolean knorpelfisch) {
        this.knorpelfisch = knorpelfisch;
    }
}
