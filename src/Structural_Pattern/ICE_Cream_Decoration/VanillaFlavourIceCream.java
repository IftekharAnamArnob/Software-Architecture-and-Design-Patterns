package Structural_Pattern.ICE_Cream_Decoration;

public class VanillaFlavourIceCream extends IceCreamDecorator{


         public VanillaFlavourIceCream(IceCream iceCream)
         {
             super(iceCream);
         }


      public String makeicecream()
      {
          return iceCream.makeicecream() + AddVanillaAndNuts();
      }

      public String AddVanillaAndNuts(){
             return " Added Vanilla And Nuts ";
      }


}
