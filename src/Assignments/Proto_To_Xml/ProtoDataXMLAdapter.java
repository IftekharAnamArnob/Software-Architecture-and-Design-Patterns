package Assignments.Proto_To_Xml;

class ProtoDataXMLAdapter implements XMLGenerator {
    private ProtoData protoData;

    public ProtoDataXMLAdapter(ProtoData protoData) {
        this.protoData = protoData;
    }

    public String generateXML() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<data>");
        xmlBuilder.append("<name>").append(protoData.getName()).append("</name>");
        xmlBuilder.append("<value>").append(protoData.getValue()).append("</value>");
        xmlBuilder.append("</data>");
        return xmlBuilder.toString();
    }
}