package Structural_Pattern.Adapter;

public class JSON {

     public JSON (String data){}

    XML converttoXML(){

      //logic to convert to xml

      return new XML("Stringified JSON data");

    }

}
