package Creational_Pattern.Builder_Pattern;

public class CoffeBuilder extends BeverageBuilder{


    @Override
    void setBeverageType() {
        System.out.println("Coffee");
        getBeverage().setBeveragename("Coffee");

    }

    @Override
    void setWater() {
        System.out.println("Step1: Boiling water!");
        getBeverage().setWater(40);

    }

    @Override
    void setmilk() {
        System.out.println("Step 2: Adding milk!");
         getBeverage().setmilk(30);
    }

    @Override
    void setsugar() {

        System.out.println("Step 3: Adding sugar");
        getBeverage().setsugar(10);


    }

    @Override
    void setPowederquantity() {
        System.out.println("Step 4: Adding 9 gram of coffee powder");
        getBeverage().setPowederquantity(9);

    }

    @Override
    Beverage CreateBeverage() {
        return new Beverage();
    }
}
