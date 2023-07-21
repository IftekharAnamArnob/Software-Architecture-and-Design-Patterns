package Behavioural_Pattern.Observer_Pattern;

import java.util.ArrayList;

public class Product implements Subject{

    private boolean availability=false;

    public void setAvailability(boolean availability){

        this.availability=availability;

        if(availability)
        {
            notifyobserver();
        }
        else
            System.out.println("The product is not available yet, pls wait somedays :)");


    }


    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
           observers.remove(observer);
    }

    @Override
    public void notifyobserver() {
        for(Observer observer:observers)
            observer.update();


    }
}
