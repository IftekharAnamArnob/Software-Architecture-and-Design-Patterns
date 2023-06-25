package Creational_Pattern.Singleton_Pattern;

public class Singleton {

       public static Singleton SingleInstance;

       private Singleton(){

       }

       public static Singleton getSingleInstance(){

             if(SingleInstance == null)
             {
                 SingleInstance = new Singleton();
                 System.out.println("Inside Null check, Object is created!" + SingleInstance.toString());
                 System.out.println("-----------------------------------------");
             }

             return SingleInstance;

       }

       public void printSingleInstance(){
           System.out.println("Printing singleton object!"+SingleInstance.toString());
           System.out.println();
       }

}
