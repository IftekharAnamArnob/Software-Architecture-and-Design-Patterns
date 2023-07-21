package Behavioural_Pattern.Memento;

public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setlEd_tv(new LEd_Tv("Samsung",42 ,false));
        careTaker.addMemento(originator.creatememento());

        originator.setlEd_tv(new LEd_Tv("LG",52,true));
        careTaker.addMemento(originator.creatememento());

        originator.setlEd_tv(new LEd_Tv("60",48,true));

        System.out.println("\n Originator Current state: "+originator);

        System.out.println("\n Originator restoring to 42 inch LED tv..");

        originator.setMemento(careTaker.getMemento(0));

        System.out.println("\n Originator current state: "+originator);

    }
}
