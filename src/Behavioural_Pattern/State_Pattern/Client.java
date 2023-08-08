package Behavioural_Pattern.State_Pattern;

public class Client {

    public static void main(String[] args) {

          ATMmachine atMmachine = new ATMmachine();

        System.out.println("Atm state is "+atMmachine.getAtMmachinestate());

         //NoCreditCard

        atMmachine.interpinWithdrawmoney();
        atMmachine.eject();
        atMmachine.insert();

        System.out.println();

        //HasCreditCard
        atMmachine.insert();
        atMmachine.interpinWithdrawmoney();
        atMmachine.eject();


    }
}
