package Creational_Pattern.Factory_Method;

public class Animal_Factory {

     public Animal getanimal(String animaltype)
     {
          Animal animal= null;

           if("dog".equalsIgnoreCase(animaltype))
           {
                animal = new Dog();
           }

           else if("duck".equalsIgnoreCase(animaltype))
           {
                animal=new Duck();
           }
           else if("Lion".equalsIgnoreCase(animaltype))
           {
                animal = new Lion();
           }

           return animal;

     }



}
