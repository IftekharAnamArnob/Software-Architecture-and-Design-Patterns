package Structural_Pattern.ICE_Cream_Decoration;

public abstract class IceCreamDecorator implements IceCream {

        protected IceCream iceCream;

        public IceCreamDecorator(IceCream iceCream)
        {
            this.iceCream=iceCream;

        }

    @Override
    public String makeicecream() {
        return iceCream.makeicecream();
    }



}
