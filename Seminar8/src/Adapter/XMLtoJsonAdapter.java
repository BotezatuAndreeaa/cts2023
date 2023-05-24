package Adapter;

import Adapter.JSONParser;
import Adapter.XMLParser;

public class XMLtoJsonAdapter implements JSONParser {
    private XMLParser xmlParser;
    @Override
    public void parserJson(String json) {
        String xml = convertJsontoXML(json);
        xmlParser.parserXML(xml);
    }

    public XMLtoJsonAdapter(XMLParser xmlParser) {
        this.xmlParser = xmlParser;
    }


    private String convertJsontoXML(String json){
        return json;
    }
}
