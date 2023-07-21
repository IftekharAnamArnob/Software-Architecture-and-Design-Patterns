package Behavioural_Pattern.Chain_Of_Responsibility;

public class Projectleader extends Employee{

      private int Max_Grant_leave= 20;


    @Override
    public void applyleave(String employeename, int numberofdaysleave) {

        if(numberofdaysleave<=Max_Grant_leave)
            Approveleave(employeename,numberofdaysleave);

        else
            supervisor.applyleave(employeename,numberofdaysleave);


    }


    public void Approveleave(String employeename,int numberofdaysleave){

        System.out.println("Projectleader approved " + numberofdaysleave + " days of leave of " + employeename );

    }
}
