package Structural_Pattern.Adapter;

public class JsonTOXmL implements IAdapter{

     JSON json;

     public JsonTOXmL(JSON json){
         this.json=json;
     }


    @Override
    public XML convert(JSON json) {
        return this.json.converttoXML();
    }
}
