package Structural_Pattern.Decorator;

public class ChickenPizza extends PizzaDecorator{

        public  ChickenPizza(PIzza pIzza){
            super(pIzza);
        }

        public  String makePizza(){
            return pIzza.makePizza()+ ChickenCheese();
        }


        public String ChickenCheese()
        {
            return " Added Chicken and Cheese ";
        }

}
