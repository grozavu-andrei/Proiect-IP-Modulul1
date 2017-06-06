/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author ionut
 */
public class MainTest {

    private Object doc;
    private Object dBuilder;

    int generate(String path) {
        int[] Studies = new int[2];
        Studies = CV.getStudiesExperience(path);
        return Studies[0] * 100 + Studies[1];
    }

    @Test
    public void testGenerate() throws Exception {
        System.out.println("generate");
        String path = "C:\\Users\\gaby_\\Desktop\\F2\\Main\\Aaron-Metcalfe.xml";
        String[] args = null;
        int[] Studies = new int[2];
        Studies = CV.getStudiesExperience(path);
        int result = generate(path);
        assertEquals(Studies[0] * 100 + Studies[1], result);
    }

    ;
    @Test
    public void getStudiesExperience() throws SAXException, IOException {
        System.out.println("1");
        int degree = 6;
        int studiesYears = 0;
        int[] studies = new int[2];
        String path = "C:\\Users\\gaby_\\Desktop\\F2\\Main\\Aaron-Metcalfe.xml";
        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = dBuilder.parse(path);
        NodeList nList = doc.getElementsByTagName("SchoolOrInstitution");
        assertEquals(6, CV.getStudiesExperience(path)[0]);
    }

    ;
    @Test
    public void getStudiesExperience2() throws SAXException, IOException {
        System.out.println("2");
        int degree = 0;
        int studiesYears = 0;
        int[] studies = new int[2];
        String path = "C:\\Users\\gaby_\\Desktop\\F2\\Main\\Aaron-Metcalfe2.xml";
        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = dBuilder.parse(path);
        NodeList nList = doc.getElementsByTagName("SchoolOrInstitution");
        assertEquals(2, CV.getStudiesExperience(path)[0]);
    }

    ;
    @Test
    public void getStudiesExperience3() throws SAXException, IOException {
        System.out.println("3");
        int degree = 0;
        int studiesYears = 0;
        int[] studies = new int[2];
        String path = "C:\\Users\\gaby_\\Desktop\\F2\\Main\\Aaron-Metcalfe3.xml";
        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = dBuilder.parse(path);
        NodeList nList = doc.getElementsByTagName("SchoolOrInstitution");
        assertEquals(4, CV.getStudiesExperience(path)[0]);
    };
}
