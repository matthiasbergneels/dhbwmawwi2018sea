package kapitel6;

public abstract class Tier {

    private float gewicht;
    private float groesse;
    private String bezeichnung;


    public Tier(float gewicht, float groesse, String bezeichnung){
        this.setGroesse(groesse);
        this.setGewicht(gewicht);
        this.setBezeichnung(bezeichnung);
    }

    public void fressen(){
        System.out.println("Das Tier " + this.getBezeichnung() + " frisst.");
    }

    public final void bewegen(){
        System.out.println("Das Tier " + this.getBezeichnung() + " bewegt sich.");
    }

    public abstract void atmet();

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public float getGroesse() {
        return groesse;
    }

    public void setGroesse(float groesse) {
        this.groesse = groesse;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Bezeichnung: " + getBezeichnung() + ", Groesse: " + getGroesse() + ", Gewicht: " + getGewicht();
    }
}
