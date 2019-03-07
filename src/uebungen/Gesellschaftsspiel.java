package uebungen;

public abstract class Gesellschaftsspiel {

    protected String name;
    protected int anzSpieler;

    public Gesellschaftsspiel(String name, int anzSpieler){
        this.name = name;
        this.anzSpieler = anzSpieler;
    }

    public abstract void spielen();

}
