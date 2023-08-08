package Assignments.Class_Diagram_implementation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        OrderDetail od = new OrderDetail(5,"Valid");
        OrderDetail od1 = new OrderDetail(6,"Invalid");
        OrderDetail od3 = new OrderDetail(7,"Invalid");

        ArrayList<OrderDetail>orderDetails = new ArrayList();
        orderDetails.add(od);
        orderDetails.add(od1);
        orderDetails.add(od3);

        Order or = new Order("11/5/2023","Valid",orderDetails);

        Item It = new Item("NOT_Expired",1.56);





    }
}