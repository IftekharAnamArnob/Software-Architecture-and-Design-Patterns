package Structural_Pattern.Composite;

public class Software_Engineer implements Employee{

      private String name;
      private int salary;
      private String designation;

      public Software_Engineer(String name,int salary,String designation)
      {
          this.name=name;
          this.salary=salary;
          this.designation=designation;

      }

      public void displayinformation()
      {
          System.out.println("Name: " +  name + " salary: " + salary+" designation: " + designation );

      }


}
