package Behavioural_Pattern.Chain_Of_Responsibility;

public class Hr extends Employee{

     private int Max_Grant_leave=30;


     public void applyleave(String employeename,int numberofdaysleave){
         if(numberofdaysleave<=Max_Grant_leave)
             Approveleave(employeename,numberofdaysleave);


             else
             System.out.println("Can't apply this much of leave!");
     }

     public void Approveleave(String name,int leave)
     {
         System.out.println("Hr approved " + leave + " days of leave of " + name );
     }

}
