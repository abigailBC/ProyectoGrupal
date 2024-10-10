package Controlador;
import Vista.Mensajito;
import Vista.Menu;

import java.io.File;
import java.util.HashMap;

import Modelo.*;

public class Inicio {

	public static void main(String[] args) {
		Mensajito mensajito = new Mensajito();
		BinaryManager bm = new BinaryManager();
		//bm.recorrer();
		Menu menuu = new Menu();
		int tipoFichero = 0;
		//bm.inicioBinario();
		try {
			
			while(tipoFichero!=4) {
				tipoFichero = menuu.menu1();
				FileManager miObjeto=null;
				File inputFile=null;
				switch (tipoFichero) {
				case 1:
					miObjeto = new FileTextManager();
					inputFile = new File("Ficheros/Libros.txt");
					break;
				case 2:
					miObjeto = new BinaryManager();
					inputFile = new File("Ficheros/Libros.bin");
					break;
				case 3:
					//miObjeto= new XMLTextManager();
					inputFile = new File("Ficheros/Libros.xml");
					break;
				case 4:
					System.out.println("El programa terminará");
					return;
				default:
					System.out.println("Ha habido un error, vuelve a seleccionar opción.");
					break;
				case 5:
					/*BatadManager miAcceso = new BadatManager();
					miAcceso.;*/
				}
				int tipoaccion = menuu.menu2(tipoFichero);
				switch(tipoaccion) {
				//Leer uno
				case 1:
					String impreso=mensajito.viewOne();
					Libro libro=miObjeto.printOne(impreso);
					if(libro!=null) {
						mensajito.mostrarLibro(libro);  
					}else {
						mensajito.noEncontrado();

					}
					mensajito.separador();
					Thread.sleep(1500);
					break;
				//Leer muchos
				case 2:
					HashMap<String, Libro>libros=miObjeto.printAll();
					mensajito.imprimirHashMap(libros);
					mensajito.separador();
					Thread.sleep(1500);
					break;
				//Añadir uno
				case 3:
					miObjeto.addOne();
					mensajito.mensaje();
					mensajito.separador();
					Thread.sleep(1500);
					break;
				//Añadir muchos
				case 4:
					miObjeto.addMore();
					mensajito.mensaje();
					mensajito.separador();
					Thread.sleep(1500);
					break;
				//editar uno
				case 5:
					String editado=mensajito.viewEdit();
					miObjeto.editOne(editado);
					mensajito.mensaje();
					mensajito.separador();
					Thread.sleep(1500);
					break;
				//borrar uno
				case 6:
					String borrado=mensajito.viewDel();
					miObjeto.deleteOne(borrado);
					mensajito.mensaje();
					mensajito.separador();
					Thread.sleep(1500);
					break;
				default:
					System.out.println("Ha habido un error. Vuelve a seleccionar las opciones");
					Thread.sleep(1500);
				}
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}

/* miObjeto = new BinaryManager(); miObjeto = new XMLTextManager(); miObjeto =
 * new FileTextManager();
 * 
 * 
 * 
 * Hashmap hm = miObjeto.leerTodos();
 * 
 * 
 * //menuu.menu2(tipoFichero);
 * 
 * modb.crearMapa();
 */

// modxml.añadirUno(inputFile);
/*
 * <nombre>Abi</nombre> getnombre()
 * 
 * 
 * abi,6,dam .split(",")
 * 
 * 
 * 
 * 0111000110110 seralizable
 */
