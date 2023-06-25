package Creational_Pattern.Builder_Pattern;

public class Beverage {

     private int water;
     private int milk;
     private int sugar;
     private int powederquantity;
     private String beveragename;

    public int getWater()
    {
        return water;
    }
    public int getMilk()
    {
        return milk;
    }

    public int getSugar(){
        return sugar;
    }

    public int getPowederquantity(){
        return powederquantity;
    }

    public String getBeveragename(){
        return beveragename;
    }

    public  void setWater(int water)
    {
        this.water=water;
    }
    public  void setmilk(int milk)
    {
        this.milk=milk;
    }
    public  void setsugar(int sugar)
    {
        this.sugar=sugar;
    }
    public  void setPowederquantity(int powederquantity)
    {
        this.powederquantity=powederquantity;
    }

    public void setBeveragename(String beveragename){
        this.beveragename=beveragename;
    }




}
