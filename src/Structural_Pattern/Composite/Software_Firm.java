package Structural_Pattern.Composite;

public class Software_Firm {

    public static void main(String[] args) {

         //Creating development software engineer
          Software_Engineer Rabbi = new Software_Engineer("Rabbi",30000,"Development Software Engineer");
         Software_Engineer Naiem = new Software_Engineer("naiem",30000,"Development Software Engineer");
          Software_Engineer Sajid = new Software_Engineer("sajid",30000,"Development Software Engineer");


         Software_Engineer Rakib = new Software_Engineer("Rakib",30000,"QA Software Engineer");
        Software_Engineer Riya = new Software_Engineer("Riya",30000,"QA Software Engineer");

        //Creating Teamleader

         Manager Rohan = new Manager("Rohan",45000,"Developer team leader");
         Manager Vijay = new Manager("Vijay",45000,"QA team leader");


         Rohan.addsubordinates(Rabbi);
         Rohan.addsubordinates(Naiem);
         Rohan.addsubordinates(Sajid);

         Vijay.addsubordinates(Rakib);
         Vijay.addsubordinates(Riya);

        //Creating Managers

         Manager Peter = new Manager("Peter",100000,"Developer manager");
         Manager John = new Manager("John",100000,"QA manager");

         Peter.addsubordinates(Rohan);
         John.addsubordinates(Vijay);

        //Creating CEO

         Manager Dave = new Manager("Dave",200000,"CEO");

         Dave.addsubordinates(Peter);
         Dave.addsubordinates(John);

         Dave.displayinformation();


    }
}
