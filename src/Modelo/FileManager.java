package Modelo;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;
import Modelo.*;

public interface FileManager {
		
	//signatura del método en la interfaz
	public Libro printOne(String impreso);
	public HashMap printAll();
	public HashMap addOne();
	public HashMap addMore();
	public Libro editOne(String editado);
	public void deleteOne(String borrado);
	
	/*leerTodos -> hashmap
	buscarUno -> ID -> Persona
	insertar ->persona
	modificar ->id ->persona
	borrar -> id
	escribirMuchos ->hashmap*/
	
}
//