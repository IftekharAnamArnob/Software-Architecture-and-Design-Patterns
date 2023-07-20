package Structural_Pattern.Decorator;

public class VegPizza extends PizzaDecorator{

      public VegPizza(PIzza pIzza){
          super(pIzza);

      }

      public String makePizza()
      {
          return pIzza.makePizza()+ VegCheese();
      }

     public String VegCheese(){
          return " Added Vegetable and Cheese ";
     }


}
