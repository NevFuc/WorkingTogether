package ch.deine.mutter;

public class NevioHatingMachine {
    public String name;
    public int anzahlBaddies;

    public NevioHatingMachine(String name,  int anzahlBaddies) {
        this.name = name;
        this.anzahlBaddies = anzahlBaddies;
    }

    public void insultNevio(){
        System.out.println("Fick dich Nevio ---|---");
    }
}
