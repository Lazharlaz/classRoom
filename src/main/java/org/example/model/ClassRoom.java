package org.example.model;

public class ClassRoom {
    public static void main(String[] args) {
       Student sacha = new Student("Sacha", true);
        Student micka = new Student("Mickael", false);
        Student lazhar = new Student("Lazhar", true);

        sacha.whoAmI();
        micka.whoAmI();
        lazhar.whoAmI();
    }
}
