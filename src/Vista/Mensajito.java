package Vista;
import Modelo.Libro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mensajito {
	Scanner sc=new Scanner(System.in);
	public void mensaje() {
		System.out.println("Funcionalidad en construcción");
	}
	public void separador() {
		System.out.println("=========================");
	}
	public String viewOne() {
		String impreso="";
		System.out.println("Escribe el ID del libro que quieres ver: ");
		impreso=sc.nextLine();
		return impreso;
	}
	public String viewDel() {
		String borrado="";
		System.out.println("Escribe el ID del libro que quieres eliminar: ");
		borrado=sc.nextLine();
		sc.close();
		return borrado;
	}
	public void ConfirmDel() {
		System.out.println("El libro ha sido eliminado correctamente");
	}
	public String viewEdit() {
		String editado="";
		System.out.println("Elige el ID del libro que quieres editar: ");
		editado=sc.nextLine();
		sc.close();
		return editado;
	}
	public void viewWriOne() {
		System.out.println("Escribe el título del libro: ");
		
		
	}
	public void noEncontrado() {
		System.out.println("El libro escogido no ha sido encontrado");
	}
	public void mostrarLibro(Libro libro) {
		System.out.println(libro.toString());
	}
	public String pedirLibro(String nombre) {
		System.out.println("Introduce el nombre del libro: ");
		nombre=sc.nextLine();
		return nombre;
	}
	public String pedirId(String id) {
		System.out.println("Introduce el ID del libro: ");
		id=sc.nextLine();
		return id;
	}
	public String pedirAutor(String autor) {
		System.out.println("Introduce el autor del libro: ");
		autor=sc.nextLine();
		return autor;
	}
	public String pedirIsbn(String isbn) {
		System.out.println("Introduce el ISBN del libro: ");
		isbn=sc.nextLine();
		return isbn;
	}
	public String pedirAnno(String anno) {
		System.out.println("Introduce el año del libro: ");
		anno=sc.nextLine();
		return anno;
	}
	public void imprimirHashMap(HashMap <String, Libro> libros) {
		for(Map.Entry<String, Libro>entry : libros.entrySet()) {
			Libro valor=entry.getValue();
			System.out.println(valor.toString());
		}
	}
}