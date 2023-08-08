package Behavioural_Pattern.State_Pattern;

public class HascreditCard implements ATMmachinestate{


    @Override
    public void insert() {
        System.out.println(" Can't Already a card inserted");
    }

    @Override
    public void interpinWithdrawmoney() {
        System.out.println("Pin number and amount inserted");

    }

    @Override
    public void eject() {
        System.out.println("Card ejected! ");

    }
}
