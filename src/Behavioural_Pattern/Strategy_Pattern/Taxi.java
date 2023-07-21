package Behavioural_Pattern.Strategy_Pattern;

public class Taxi implements TravelStartegy{

    @Override
    public void gotoairport() {
        System.out.println("Travelling by Taxi Fare: 300 taka");
    }
}
