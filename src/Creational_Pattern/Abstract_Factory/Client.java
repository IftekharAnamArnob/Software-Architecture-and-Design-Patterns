package Creational_Pattern.Abstract_Factory;

public class Client {

    public static void main(String[] args) {

        Animal_Factory animal_factory = null;
        Animal animal = null;

        animal_factory = Animal_Factory.getAnimalfactory("land");

        System.out.println("Animal Factory Type: "+animal_factory.getClass().getName());

        animal= animal_factory.getAnimal("dog");

        System.out.println("Animal type is : "+animal.getClass().getName());
        System.out.println("Animal speaks: "+animal.speak());

        animal=animal_factory.getAnimal("duck");

        System.out.println("Animal type is :"+animal.getClass().getName());
        System.out.println("Animal speaks: "+animal.speak());
        System.out.println("---------------------------");

        animal_factory=Animal_Factory.getAnimalfactory("sea");

        System.out.println("Animal Factory Type: "+animal_factory.getClass().getName());

        animal=animal_factory.getAnimal("shark");
        System.out.println("Animal type :"+animal.getClass().getName());
        System.out.println("Animal speaks: "+animal.speak());

        animal=animal_factory.getAnimal("octopus");
        System.out.println("Animal type :"+animal.getClass().getName());
        System.out.println("Animal type :"+animal.speak());

    }
}
