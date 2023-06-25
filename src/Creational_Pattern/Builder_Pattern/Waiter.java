package Creational_Pattern.Builder_Pattern;

public class Waiter {

    public static Beverage takeorder(String beveragetype)
    {
        BeverageBuilder beverageBuilder = null;

        if("Tea".equals(beveragetype))
        {
            beverageBuilder = new TeaBuilder();
        }
        else if("Coffee".equals(beveragetype))
        {
            beverageBuilder = new CoffeBuilder();
        }
        else
            System.out.println("We don't serve this beverage! ");

        return beverageBuilder.buildbeverage();

    }



}
