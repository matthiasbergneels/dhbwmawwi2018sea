package kapitel6;

public final class Hund extends Tier{

    private String rasse;

    public Hund(float groesse, float gewicht, String bezeichnung, String rasse){
        super(gewicht, groesse, bezeichnung);
        setRasse(rasse);
    }

    public void bellen(){
        System.out.println("Der Hund "+ getBezeichnung() + " bellt!");
    }

    @Override
    public void atmen() {
        System.out.println("Der Hund " + getBezeichnung() + " atmet - *hächel*");
    }

    // Überladen der Methode fressen aus der Klasse Tier
    public void fressen(float menge){
        System.out.println("Der Hund " + getBezeichnung() + " frisst + " + menge + " kg Fleisch!");
    }

    // Überschreiben von der Methode fressen aus der Klasse Tier
    @Override
    public void fressen(){
        System.out.println("Der Hund " + getBezeichnung() + " frisst Fleisch");
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    @Override
    public String toString() {

        return super.toString() + ", Rasse: " + getRasse();
    }

}
