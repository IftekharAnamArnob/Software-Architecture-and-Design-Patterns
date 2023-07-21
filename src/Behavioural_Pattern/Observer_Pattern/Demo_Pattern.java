package Behavioural_Pattern.Observer_Pattern;

public class Demo_Pattern {

    public static void main(String[] args) {

        Product TV = new Product();

        Observer person1 = new Person("John",TV);
        Observer person2 = new Person("Smith",TV);
        Observer person3 = new Person("Russel",TV);


        TV.setAvailability(false);
        System.out.println();

        TV.setAvailability(true);




    }
}
