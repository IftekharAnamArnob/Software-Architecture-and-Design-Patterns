package Creational_Pattern.Prototype_Pattern;

public class Sheep implements Animal{

      public Sheep(){
            System.out.println("Sheep is made");
      }


      @Override
      public Animal makecopy() {

            System.out.println("Sheep is being cloned");
            Sheep sheep = null;

            try {
                  sheep = (Sheep) super.clone();
            } catch (CloneNotSupportedException e) {
                  throw new RuntimeException(e);
            }

            return sheep;

      }

      public String toString()
      {
            return "Baa Baar black sheep!";
      }
}
