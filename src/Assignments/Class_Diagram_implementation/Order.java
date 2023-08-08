package Assignments.Class_Diagram_implementation;

import java.util.ArrayList;

public class Order {

    private String date;
    private String status;
    ArrayList<OrderDetail>orders;

    public Order(String date,String status,ArrayList<OrderDetail> orders){

        this.date=date;
        this.status=status;
        this.orders=orders;


    }

    public void calcSubTotal (){

        System.out.println("This is order calcSubtotal");


    }
    public void calcTax (){

        System.out.println("This is order calcTax");


    }
    public void calcTotal (){

        System.out.println("This is order calcTotal");

    }
    public void calcTotalWeight (){

        System.out.println("This is order calcTotalWeight");

    }

}
