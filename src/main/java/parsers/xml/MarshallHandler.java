package parsers.xml;

import customexceptions.PlutoJAXBException;
import exception.ExceptionHandler;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MarshallHandler {

    public static String marshallObject(Object obj)
            throws PlutoJAXBException {
        try {
            JAXBContext jContext = JAXBContext.newInstance(obj.getClass());
            Marshaller m = jContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            m.marshal(obj, sw);
            return sw.toString();
        } catch (JAXBException ex) {
            throw new PlutoJAXBException(ExceptionHandler.getExceptionDetails(ex));
        }

    }

    public static Object unmarshallObject(String marshal, Object obj)
            throws PlutoJAXBException {
        try {
            JAXBContext jContext = JAXBContext.newInstance(obj.getClass());
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            StringReader reader = new StringReader(marshal);
            return unmarshallerObj.unmarshal(reader);
        } catch (JAXBException ex) {
            throw new PlutoJAXBException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

}
