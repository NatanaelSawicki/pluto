package parsers.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.List;

public class XMLHandler {
    
    public static String objectToXML(Object param){
        XStream xs = new XStream(new DomDriver());
        return xs.toXML(param);
    }
   
    public static Object fromXML(String xml){
        if(xml.isEmpty() || xml == null){
            return null;
        }
        return new XStream(new DomDriver()).fromXML(xml);
    }
    
}
