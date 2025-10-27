/*
* Creator: Elia Brunner
*/
package ch.coolesPackage.testingPackage;

public class Main {
    public static void main(String[] args) {
        Person nevio = new Person("Nevio", 10000);
        Person elia = new Person("Elia", 10000);
        Person oliver = new Person("Oliver", 10000);

        System.out.println("Nevios baddies: " + nevio.anzahlBaddies);
        System.out.println("Elias baddies: " + elia.anzahlBaddies);
        System.out.println("Olivers baddies: " + oliver.anzahlBaddies);
    }
}
