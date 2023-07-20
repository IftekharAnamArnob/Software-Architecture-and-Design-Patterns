package Structural_Pattern.Decorator;

public class Decorator_Demo {

    public static void main(String[] args) {

         PlainPizza plainPizzaObj = new PlainPizza();
         String plainpizza = plainPizzaObj.makePizza();
        System.out.println(plainpizza);


       String Chickenpizza= new ChickenPizza(plainPizzaObj).makePizza();

        System.out.println("\n " + Chickenpizza + " Using ChickenPizzaDecorator");

        String vegpizza = new VegPizza(plainPizzaObj).makePizza();

        System.out.println("\n " + vegpizza + " Using vegpizza");
    }
}
