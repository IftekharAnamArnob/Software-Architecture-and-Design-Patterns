package Behavioural_Pattern.Observer_Pattern;

public interface Subject {

     void subscribe(Observer observer);
     void unsubscribe(Observer observer);
     void notifyobserver();

}
