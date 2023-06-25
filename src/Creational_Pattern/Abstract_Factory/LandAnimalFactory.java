package Creational_Pattern.Abstract_Factory;

public class LandAnimalFactory extends Animal_Factory{

    public  Animal getAnimal(String animaltype)
    {
        Animal animal= null;
        if("dog".equals(animaltype))
        {
            animal = new Dog();

        }
        if("duck".equals(animaltype))
        {
            animal = new Duck();

        }
        if("lion".equals(animaltype))
        {
            animal = new Lion();

        }
        return animal;

    }
}
