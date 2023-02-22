package com.jose.xml;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.jose.xml.entidades.Asignatura;
import com.jose.xml.entidades.NoticiaMundo;
import com.jose.xml.entidades.NoticiasCine;


public class App 
{
	
	public static void leerXmlFichero(String nombreFichero) {
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			System.out.println("Elemento base : " + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("asignatura");
			System.out.println();
			System.out.println("Recorriendo asignaturas...");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Codigo: " + eElement.getAttribute("id"));
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println(
							"Ciclo: " + eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent());
					System.out.println("Curso: " + eElement.getElementsByTagName("curso").item(0).getTextContent());
					System.out
							.println("Profesor: " + eElement.getElementsByTagName("profesor").item(0).getTextContent());
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static List<Asignatura> devolverAsignaturas(String nombreFichero) {
		List<Asignatura> resultado = new ArrayList<>();
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("asignatura");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new Asignatura(
							eElement.getAttribute("id"),
							eElement.getElementsByTagName("nombre").item(0).getTextContent(),
							eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent(),
							eElement.getElementsByTagName("curso").item(0).getTextContent(),
							eElement.getElementsByTagName("profesor").item(0).getTextContent()					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	
	
	public static List<NoticiaMundo> devolverNoticiasMundo(String web) {
		List<NoticiaMundo> resultado = new ArrayList<>();
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(web);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("item");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new NoticiaMundo(
							eElement.getElementsByTagName("title").item(0).getTextContent(),
							eElement.getElementsByTagName("description").item(0).getTextContent(),
							eElement.getElementsByTagName("dc:creator").item(0).getTextContent(),
							eElement.getElementsByTagName("category").item(0).getTextContent(),
							eElement.getElementsByTagName("guid").item(0).getTextContent(),
							eElement.getElementsByTagName("pubDate").item(0).getTextContent()					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	public static List<NoticiasCine> devolverNoticiasCine(String web) {
		List<NoticiasCine> resultado = new ArrayList<>();
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(web);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("item");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new NoticiasCine(
							eElement.getElementsByTagName("category").item(0).getTextContent(),
							eElement.getElementsByTagName("title").item(0).getTextContent(),
							eElement.getElementsByTagName("description").item(0).getTextContent(),
							eElement.getElementsByTagName("link").item(0).getTextContent(),
							eElement.getElementsByTagName("guid").item(0).getTextContent(),
							eElement.getElementsByTagName("author").item(0).getAttributes().getNamedItem("name").getTextContent(),
							LocalDate.parse(eElement.getElementsByTagName("pubDate").item(0).getTextContent(), DateTimeFormatter.RFC_1123_DATE_TIME)			
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}

	

	
	
    public static void main( String[] args )
    {
        //leerXmlFichero("asignaturas.xml");
    	/*List<Asignatura> asignaturas = devolverAsignaturas("asignaturas.xml");
    	asignaturas.stream()
    		.filter(e->e.getCurso().equals("Segundo"))
    		.forEach(e->System.out.println(e));
    	*/
    	
    	/*List<NoticiaMundo> noticias = devolverNoticiasMundo("https://e00-elmundo.uecdn.es/elmundo/rss/portada.xml");
    	noticias.forEach(e->System.out.println(e.getTitle()));
    		*/	
    	/*String fecha = "Thu, 16 Feb 2023 09:23:39 +0100";
    	LocalDate fechaParse=LocalDate.parse(fecha, DateTimeFormatter.RFC_1123_DATE_TIMEnotic);
    	System.out.println(fechaParse);
    	*/
    	List<NoticiasCine> noticias = devolverNoticiasCine("https://www.sensacine.com/rss/noticias.xml");
    	noticias.forEach(e->System.out.println(e));
    }
}