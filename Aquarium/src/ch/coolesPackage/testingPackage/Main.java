/*
* Creator: Elia Brunner
*/
package ch.coolesPackage.testingPackage;

public class Main {
    public static void main(String[] args) {
        Person nevio = new Person("Nevio", 10);
        Person elia = new Person("Elia", 10);
        Person oliver = new Person("Oliver", 10);

        System.out.println("Nevios baddies: " + nevio.anzahlBaddies);
        System.out.println("Elias baddies: " + elia.anzahlBaddies);
        System.out.println("Olivers baddies: " + oliver.anzahlBaddies);
    }
}
