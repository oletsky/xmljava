package oletsky.java.xml;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXTester {
    public static void main (String[] args) throws Exception{

        String filename="books.xml";
        DefaultHandler handler= new SAXCounter();
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(filename,handler);
    }

}
