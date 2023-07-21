package Behavioural_Pattern.Observer_Pattern;

public class Person implements Observer{

    private String name;
    private Subject subject;


    public Person(String name,Subject subject){
        this.name=name;
        this.subject=subject;
        subject.subscribe(this);
    }


    @Override
    public void update() {
        System.out.println("LED TV is Available pls book now!!" + name);
    }
}
