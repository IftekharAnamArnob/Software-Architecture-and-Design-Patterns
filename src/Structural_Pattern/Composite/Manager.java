package Structural_Pattern.Composite;

import java.util.ArrayList;

public class Manager implements Employee {

     private String name;
     private int salary;
     private String designation;


     public  Manager(String name,int salary,String designation)
     {
         this.name=name;
         this.salary=salary;
         this.designation=designation;

     }

     ArrayList<Employee> subordinates = new ArrayList<>();


     public void addsubordinates(Employee employee)
     {
         subordinates.add(employee);
     }

     public void removesubordinates(Employee employee)
     {
         subordinates.remove(employee);
     }


    @Override
    public void displayinformation() {
        System.out.println("Name: " + name+ " salary: " + salary+" designation: "+designation );
        System.out.println("Subordinates");
        for(Employee subordinate:subordinates)
        {
            subordinate.displayinformation();
        }
        System.out.println();


    }
}
