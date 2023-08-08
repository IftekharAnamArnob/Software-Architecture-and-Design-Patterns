package Behavioural_Pattern.State_Pattern;

public class NocreditCard implements ATMmachinestate{


    @Override
    public void insert() {
        System.out.println("Card Inserted now please enter pin!");
    }

    @Override
    public void interpinWithdrawmoney() {
        System.out.println("First enter card first");

    }

    @Override
    public void eject() {
        System.out.println("There is no card inserted");

    }
}
