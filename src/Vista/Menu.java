package Vista;
import java.util.Scanner;
public class Menu {
	Scanner sc=new Scanner(System.in);
	private int tipoFichero;
	private int tipoaccion;
	public int menu1() {
		System.out.println("Bienvenido. Elija una opción:\n1.Fichero de texto"
				+ "\n2.Fichero Binario\n3.Fichero XML\n4.Salir");
		tipoFichero=sc.nextInt();
		return tipoFichero;
	}
	public int menu2(int opcionFichero) {
		System.out.println("¿Qué quieres hacer?\n1.Leer uno\n2.Leer muchos"
				+ "\n3.Insertar uno\n4.Insertar muchos\n5.Modificar\n6.Borrar");
		tipoaccion=sc.nextInt();
		return tipoaccion;
	}
}