package org.example.model;

public class Student {
    private String name;
    private boolean aware;

    public Student(String name , boolean aware){
        this.name = name;
        this.aware = aware;

    }
    public void  whoAmI() {
        if (this.aware){

            System.out.println("Je m'apelle : " + this.name + "et je suis aware");

        }else{
             System.out.println("Je m'apelle : " + this.name + "et je ne suis pas aware");
        }

    }
}
