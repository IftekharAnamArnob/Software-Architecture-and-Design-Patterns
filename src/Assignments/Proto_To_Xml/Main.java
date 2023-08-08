package Assignments.Proto_To_Xml;

public class Main {
    public static void main(String[] args) {
        ProtoData protoData = new ProtoData("Example", 42);
        XMLGenerator xmlGenerator = new ProtoDataXMLAdapter(protoData);

        String xml = xmlGenerator.generateXML();
        System.out.println(xml);
    }
}