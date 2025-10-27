package ch.deine.mutter;

public class NevioHatingMachine {
    public String name;
    public int anzahlBaddies;

    public NevioHatingMachine(String name,  int anzahlBaddies) {
        if(name.equals("Nevio")){
            this.anzahlBaddies = 0;
        } else if(name.equals("Elia")){
            this.anzahlBaddies = 1;
        } else {
            this.anzahlBaddies = 100;
        }
        this.name = name;
    }

    public void insultNevio(){
        System.out.println("Fick dich Nevio ---|---");
    }
}
