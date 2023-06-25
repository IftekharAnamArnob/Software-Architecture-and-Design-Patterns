package Creational_Pattern.Builder_Pattern;

public  abstract class BeverageBuilder {

      private Beverage beverage;

      public Beverage getBeverage(){
            return beverage;
      }

      public void setBeverage(Beverage beverage){
            this.beverage=beverage;

      }

      /*
       Template method to create beverage object after
       adding components in required proportion

       */

      public final Beverage buildbeverage()
      {
            Beverage beverage = CreateBeverage();
            setBeverage(beverage);
            setBeverageType();
            setWater();
            setmilk();
            setsugar();
            setPowederquantity();

            return beverage;
      }


      abstract void setBeverageType();
      abstract void setWater();
      abstract void  setmilk();
      abstract void setsugar();
      abstract void setPowederquantity();
      abstract Beverage CreateBeverage();



}
