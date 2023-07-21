package Behavioural_Pattern.Chain_Of_Responsibility;

public abstract class Employee {

    protected Employee supervisor;

    public void setnextsupervisor(Employee supervisor){

        this.supervisor=supervisor;

    }

    public abstract void applyleave(String employeename,int numberofdaysleave);




}
