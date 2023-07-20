package Structural_Pattern.Adapter;

public class Client {

     public static void main(String[] args) {
          JSON json = new JSON("json data");
          IAdapter iAdapter = new JsonTOXmL(json);
          XML xml = iAdapter.convert(json);

     }


}
