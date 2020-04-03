package gov.ua.olevsk.upszn;

import com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException;
import gov.ua.olevsk.upszn.entity.Bank;
import javafx.util.BuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class Parser {
     public static void main(String[] args) throws IOException, SAXException, XMLConfigurationException, ParserConfigurationException {
         File inputFile = new File("SP18160000017032020.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("app");
         System.out.println("----------------------------");

         for (int i = 0; i < nList.getLength(); i++) {
             Node nNode = nList.item(i);
             System.out.println("\nCurrent Element: " + nNode.getNodeName());

             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                 Element eElement = (Element) nNode;
                 System.out.println("Recipient record ID: " + eElement.getElementsByTagName("olspRecId").item(0).getTextContent());
                 System.out.println("IPN: " +  eElement.getElementsByTagName("ipn").item(0).getTextContent());
                 //System.out.println("SERIES: " +  eElement.getElementsByTagName("series").item(0).getTextContent());
                 System.out.println("NUMBER: " +  eElement.getElementsByTagName("number").item(0).getTextContent());
                 System.out.println("DATE REPORT: " +  eElement.getElementsByTagName("dateReport").item(0).getTextContent());
                 System.out.println("PERCENT: " +  eElement.getElementsByTagName("percent").item(0).getTextContent());
                 System.out.println("SUM PAY: " +  eElement.getElementsByTagName("sumPay").item(0).getTextContent());


             }
         }
     }

}
