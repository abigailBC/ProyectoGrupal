package Modelo;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import Vista.Mensajito;

public class BinaryManager implements FileManager, Serializable {
	File binario = new File("Ficheros/Libros.bin");
	HashMap<String, Libro> libros= new HashMap<>();
	Mensajito vista=new Mensajito();
	//serializa el fichero binario para meter los objetos, SE HACE SOLO UNA VEZ O CUANDO HAGA FALTA RESETEAR EL FICHERO
	public void inicioBinario() {
		try {
			Libro libro1= new Libro("0001","Una noche de niebla y furia","Sarah J. Maas","978-84-08-29096-4",2016);
			libros.put("0001", libro1);
			Libro libro2= new Libro("0002","El nombre del viento","Patrick Rothfuss","978-84-01-33720-8",2007);
			libros.put("0002", libro2);
			Libro libro3= new Libro("0003","Cien años de soledad","Gabriel García Márquez","978-84-376-0494-7",1967);
			libros.put("0003", libro3);
			Libro libro4= new Libro("0004","1984","George Orwell","978-84-376-0495-4",1949);
			libros.put("0004", libro4);
			Libro libro5= new Libro("0005","Los pilares de la tierra","Ken Follett","978-84-01-33153-4",1989);
			libros.put("0005", libro5);
			Libro libro6= new Libro("0006","La sombra del viento","Carlos Ruiz Zafón","978-84-08-11100-9",2001);
			libros.put("0006", libro6);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(binario));
			for(Map.Entry<String, Libro>entry : libros.entrySet()) {
				String key = entry.getKey();
				Libro valor=entry.getValue();
				oos.writeObject(valor);
			}
			oos.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public HashMap<String, Libro> recorrer() {
		try {
			FileInputStream fis= new FileInputStream(binario);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Libro libro;
			while(true) {
				try {
					libro=(Libro)ois.readObject();
					String clave=libro.getId();
					libros.put(clave, libro);
				} catch (EOFException e) {
					// TODO Auto-generated catch block
					break;
				}
				
			}

			ois.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return libros;
		}
		public void guardarLibros(HashMap<String, Libro> libros) {
			try {
		        // Abrimos el archivo en modo de escritura, sobrescribe el archivo existente
		        FileOutputStream fos = new FileOutputStream(binario);
		        ObjectOutputStream oos = new ObjectOutputStream(fos);

		        // Iteramos sobre el HashMap y escribimos cada libro en el archivo
		        for (Map.Entry<String, Libro> entry : libros.entrySet()) {
		            oos.writeObject(entry.getValue());  // Escribimos el objeto 'Libro'
		        }

		        // Cerramos el ObjectOutputStream para asegurarnos de que todo se ha escrito
		        oos.close();

		        System.out.println("Archivo binario sobrescrito exitosamente.");

		    } catch (IOException e) {
		        System.out.println("Error al sobrescribir el archivo: " + e.getMessage());
		        e.printStackTrace();
		    }
		}
			
		
	@Override
	public Libro printOne(String impreso) {
		HashMap <String, Libro> libros=recorrer();
		Libro libro=libros.get(impreso);
		return libro;
				
	}

	@Override
	public HashMap<String, Libro> addOne() {
		HashMap <String, Libro> libros=recorrer();
		
		return libros;
	}

	@Override
	public Libro editOne(String editado) {
		HashMap <String, Libro> libros=recorrer();
		return null;
	}

	@Override
	public HashMap<String, Libro> addMore() {
		HashMap <String, Libro> libros=recorrer();

		return null;
	}

	@Override
	public HashMap<String, Libro> printAll() {
		HashMap <String, Libro> libros=recorrer();
		return libros;
	}

	@Override
	public void deleteOne(String borrado) {
		HashMap <String, Libro> libros=recorrer();
		

		// TODO Auto-generated method stub

	}
	
}