package Structural_Pattern.ICE_Cream_Decoration;

public class ICe_Cream_Truck {

    public static void main(String[] args) {

         RawIceCream rawIceCreamObj = new RawIceCream();
         String rawicecream = rawIceCreamObj.makeicecream();
        System.out.println(rawicecream);


        String VanillaICEcream = new VanillaFlavourIceCream(rawIceCreamObj).makeicecream();
        System.out.println("\n " + VanillaICEcream + "usingVanillaDecorator");

        String ChocolateICEcream = new ChocolateICeCream(rawIceCreamObj).makeicecream();
        System.out.println("\n " + ChocolateICEcream + "usingChocolateDecorator");


    }
}
