package Assignments.Building_Burger;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("medium")
                .cheese(true).lettuce(true).tomato(true).build();

        System.out.println("Cheese: " + burger.hasCheese());
        System.out.println("Lettuce: " + burger.hasLettuce());
        System.out.println("Tomato: " + burger.hasTomato());
        System.out.println("Onions: " + burger.hasOnions());
    }
}