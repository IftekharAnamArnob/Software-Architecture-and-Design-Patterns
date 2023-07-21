package Behavioural_Pattern.Chain_Of_Responsibility;

public class TeamLeader extends Employee{

    private int Max_grant_leave=10;


    @Override
    public void applyleave(String employeename, int numberofdaysleave) {

         if(numberofdaysleave<=Max_grant_leave)
             Approveleave(employeename,numberofdaysleave);

         else
         {
             supervisor.applyleave(employeename,numberofdaysleave);
         }


    }


    public void Approveleave(String employeename,int numberofdaysleave)
    {
        System.out.println("Teamleader approved " + numberofdaysleave + " days of leave of " + employeename );
    }
}
