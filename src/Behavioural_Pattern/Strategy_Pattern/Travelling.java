package Behavioural_Pattern.Strategy_Pattern;

import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        System.out.println("BUS, Auto or Taxi ?");

        Scanner scanner = new Scanner(System.in);
        String traveltype = scanner.next();

        TravelContext travelContext = new TravelContext();

        if(traveltype.equalsIgnoreCase("Bus"))
        {
            travelContext.setTravelStartegy(new Bus());
        }
        else if(traveltype.equalsIgnoreCase("Auto"))
        {
            travelContext.setTravelStartegy(new Auto());
        }
        else if(traveltype.equalsIgnoreCase("Taxi")){
            travelContext.setTravelStartegy(new Taxi());
        }

        System.out.println("Travelstrategy is " +traveltype);

        travelContext.gotoairport();

    }
}
