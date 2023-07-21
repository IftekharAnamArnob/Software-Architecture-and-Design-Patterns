package Behavioural_Pattern.Strategy_Pattern;

public class Bus implements TravelStartegy{


    @Override
    public void gotoairport() {
        System.out.println("Travelling By Bus Fare:25 taka ");

    }
}
