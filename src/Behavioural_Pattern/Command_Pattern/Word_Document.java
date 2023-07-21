package Behavioural_Pattern.Command_Pattern;


//Receiver

public class Word_Document {

     void Open()
     {
         System.out.println("Document Opened");
     }

    void Save()
    {
        System.out.println("Document Saved");
    }

    void Close()
    {
        System.out.println("Document Closed");
    }

}
