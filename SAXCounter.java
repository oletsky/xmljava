package oletsky.java.xml;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

    public class SAXCounter extends DefaultHandler {
        public int cnt;
        String elem;
        public void startDocument(){
            System.out.println("Book catalog: ");
            cnt=0;
        }
        public void endDocument(){
            System.out.println("The amount of  books is  "+cnt);
        }

        public void characters(char [] chars,
                                int startIndex,
                                int endIndex) {
            String dataString = new String (chars, startIndex, endIndex).trim();
            if (elem.equals("author")) System.out.print(dataString);
            if (elem.equals("title")) System.out.print(dataString);
        }

        public void startElement(String namespaceUri,
                                 String localName,
                                 String qualifiedName,
                                 Attributes attributes) {

            if  (qualifiedName.equals("book")) {cnt++;}
            elem=qualifiedName;
            if (elem.equals("author")) System.out.print(cnt+". ");
        }

        public void endElement(String namespaceUri,
                                String localName,
                                String qualifiedName) {
            if (elem.equals("author")) System.out.print(". ");
            if (elem.equals("title")) System.out.print("\n");
        }



    }
