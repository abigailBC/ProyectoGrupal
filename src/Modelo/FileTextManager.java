package Modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;
import Vista.Mensajito;

public class FileTextManager implements FileManager{
	Mensajito mensajito=new Mensajito();
	HashMap <String, Libro> libros=new HashMap<>();
	File texto = new File("Ficheros/Libros.txt");

	public HashMap recorrer() {
		try {
			String[] atribs;
			FileReader fr =new FileReader(texto);
			BufferedReader br = new BufferedReader(fr);
			String linea = new String();
			
			while((linea=br.readLine())!=null) {
				//System.out.println(linea);
				atribs=linea.split(",");
				//Libro libro = new Libro(libro.Integer.parseInt(setId()), );
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return libros;
	}
	
	public HashMap printAll() {
		
		return libros;
	}


	@Override
	public Libro printOne(String impreso) {
		
		
		return null;
	}

	@Override
	public HashMap addOne() {
		return null;
	}

	@Override
	public Libro editOne(String editado) {
		return null;
	}

	@Override
	public HashMap addMore() {
		return null;
	}

	@Override
	public void deleteOne(String borrado) {
		// TODO Auto-generated method stub
		
	}
}
	