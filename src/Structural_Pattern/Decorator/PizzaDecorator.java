package Structural_Pattern.Decorator;

public  abstract class PizzaDecorator implements PIzza {

       protected PIzza pIzza;

       public  PizzaDecorator(PIzza pIzza)
       {
              this.pIzza=pIzza;

       }

     public String makePizza(){

            return pIzza.makePizza();
       }

}
