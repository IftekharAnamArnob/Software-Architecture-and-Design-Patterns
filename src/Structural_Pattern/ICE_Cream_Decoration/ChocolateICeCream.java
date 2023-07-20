package Structural_Pattern.ICE_Cream_Decoration;

public class ChocolateICeCream extends IceCreamDecorator{

      public ChocolateICeCream(IceCream iceCream)
      {
            super(iceCream);
      }


      public String makeicecream(){

            return iceCream.makeicecream() + AddChocolateAndNuts();
      }

      public String AddChocolateAndNuts()
      {
            return " Added Chocolate and nuts ";
      }


}
