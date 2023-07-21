package Behavioural_Pattern.Strategy_Pattern;

public class Auto implements TravelStartegy{

    @Override
    public void gotoairport() {
        System.out.println("Travelling by Auto  Fare: 100 taka");
    }
}
