package Behavioural_Pattern.State_Pattern;

public class ATMmachine implements ATMmachinestate{


     private ATMmachinestate atMmachinestate;

     public ATMmachine()
     {
          atMmachinestate = new NocreditCard();
     }


     public ATMmachinestate getAtMmachinestate()
     {
          return atMmachinestate;
     }
     public void setAtMmachinestate(ATMmachinestate atMmachinestate)
     {
          this.atMmachinestate=atMmachinestate;

     }


     @Override
     public void insert() {
          atMmachinestate.insert();

          //state changing

          if(atMmachinestate instanceof NocreditCard)
          {
               ATMmachinestate hascreditcard = new HascreditCard();
               setAtMmachinestate(hascreditcard);
               System.out.println("State is "+atMmachinestate.getClass().getName());

          }
     }

     @Override
     public void interpinWithdrawmoney() {
          atMmachinestate.interpinWithdrawmoney();

     }

     @Override
     public void eject() {

          atMmachinestate.eject();

          //State changes

          if(atMmachinestate instanceof HascreditCard)
          {
               ATMmachinestate nocreditcard = new NocreditCard();
               setAtMmachinestate(nocreditcard);
               System.out.println("State is "+atMmachinestate.getClass().getName());
          }

     }
}
