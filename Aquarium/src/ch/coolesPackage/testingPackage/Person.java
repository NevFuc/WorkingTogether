package ch.coolesPackage.testingPackage;

public class Person {
    public String name;
    public int anzahlBaddies;

    public Person(String name, int anzahlBaddies) {
        if(name.equals("Nevio")){
            this.anzahlBaddies = 0;
        } else if(name.equals("Elia")){
            this.anzahlBaddies = 1;
        } else {
            this.anzahlBaddies = anzahlBaddies;
        }
        this.name = name;
    }

    public void insultNevio(){
        System.out.println("Du bist uncool");
    }
}
