package Creational_Pattern.Abstract_Factory;

public abstract class Animal_Factory {

    public abstract Animal getAnimal(String animaltype);

    public static Animal_Factory getAnimalfactory(String factorytype){
        Animal_Factory animal_factory= null;

        if("sea".equals(factorytype))
        {
              animal_factory = new SeaAnimalFactory();
        }
        else
        {
           animal_factory=new LandAnimalFactory();
        }

       return animal_factory;

    }

}
