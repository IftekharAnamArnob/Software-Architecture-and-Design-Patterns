package Creational_Pattern.Factory_Method;

public class Client {

    public static void main(String[] args) {
        Animal_Factory animal_factory = new Animal_Factory();
        Animal animal = animal_factory.getanimal("dog");
        System.out.println("Animal Type: "+animal.getClass().getName());
        System.out.println("Dog speak :"+animal.speak());

        animal=animal_factory.getanimal("Duck");
        System.out.println("Animal Type: "+animal.getClass().getName());
        System.out.println("duck speaks: "+animal.speak());

        animal=animal_factory.getanimal("Lion");
        System.out.println("Animal Type: "+animal.getClass().getName());
        System.out.println("Lion speaks: "+animal.speak());





    }




}
