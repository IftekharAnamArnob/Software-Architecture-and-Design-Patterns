package Creational_Pattern.Abstract_Factory;

public class SeaAnimalFactory extends Animal_Factory{


    public Animal getAnimal(String animaltype)
    {
        Animal animal = null;
        if("shark".equals(animaltype))
        {
            animal= new Shark();

        }
        if("octopus".equals(animaltype))
        {
            animal= new Octopus();

        }
        return animal;
    }

}
