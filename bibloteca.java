package practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class bibloteca {
	// atributos
	private libro l;
	private ArrayList<libro> almacen = new ArrayList<libro>();
	public Scanner leer = new Scanner(System.in);

	// metodos
	public void add_libros() {// metodos para agregar un libro
		l = new libro();// inicializar libro
		// toma de datos
		System.out.println("Ingresar el ISBN: ");
		l.setISBM(leer.nextLong());
		System.out.println("Ingresar el autor: ");
		l.setAutor(leer.next());
		System.out.println("Ingresar el titulo: ");
		l.setTitulo(leer.next());
		System.out.println("Ingresar el año: ");
		l.setYear(leer.nextInt());
		// settear estado libro false es nuevo
		l.setEstado(false);
		// ingresamos libro a almacen
		almacen.add(l);
	}

	public void listar() {// metodo para listar datos
		for (libro libro : almacen) {
			System.out.println(libro.toString());
		}
	}
	public void prestar() {// metodo para prestar libro
		// variables buscador= ISBN para buscar ;Persona = el nombre de la persona que
		// sera prestado libro
		long buscador = 0;
		String persona = "\0";
		System.out.println("Ingrese el ISBN del libro");
		buscador = leer.nextLong();
		for (int i = 0; i < almacen.size(); i++) {
			if (buscador == almacen.get(i).getISBM()) {
				System.out.println("Ingrese el nombre de la persona:");
				persona = leer.next();
				almacen.get(i).setEstado(true);
				almacen.get(i).setPrestado(persona);
				System.out.println(almacen.get(i).toString());
				System.out.println("Libro registrado la prestacion de forma exitosa 7u7");
				break;// para que deje de buscar en el almacen si lo encuentra
			}
			while (buscador != almacen.get(i).getISBM() && i == almacen.size() - 1) {
				System.out.println("Libro no encontrado unu");
				System.out.print("Desesa volver a intentarlo :" + "\nsi o no ?:");
				String respuesta = leer.next();
				if (respuesta.toLowerCase().equals("si")) {
					System.out.println("Ingrese el ISBN del libro");
					buscador = leer.nextLong();
					if (buscador == almacen.get(i).getISBM()) {
						System.out.println("Ingrese el nombre de la persona:");
						persona = leer.next();
						almacen.get(i).setEstado(true);
						almacen.get(i).setPrestado(persona);
						System.out.println(almacen.get(i).toString());
						System.out.println("Libro registrado la prestacion de forma exitosa 7u7");
						break;
					}
				} else {
					break;
				}
			}
		}
	}
	public void devolver() {
		long buscador = 0;//bariable para buscar el isbn 
		System.out.println("Ingrese el ISBN del libro");
		//ingreso por teclado del buscado
		buscador = leer.nextLong();
		for (int i = 0; i < almacen.size(); i++) {
			if (buscador == almacen.get(i).getISBM()) {
				//doy el estado en falso ya que el libro ahora debe estar disponible
				almacen.get(i).setEstado(false);
				//setteo en string vacio persona ya que no hay un prestamista
				almacen.get(i).setPrestado("\0");
				//imprimo datos de libro 
				System.out.println(almacen.get(i).toString());
				// mensaje satisfactorio uwu
				System.out.println("Libro registrado la devolucion de forma exitosa 7u7");
				break;// para que deje de buscar en el almacen si lo encuentra
			}
			//mietras el buscador llegue al final y no encuentre el imbs que se ingreso pedira un nuevo ingreso de imbs
			//y pregutara si dese volver a intentarlo con un si o un no
			while (buscador != almacen.get(i).getISBM() && i == almacen.size() - 1) {
				System.out.println("Libro no encontrado unu");
				System.out.print("Desesa volver a intentarlo :" + "\nsi o no ?:");
				String respuesta = leer.next();
				if (respuesta.toLowerCase().equals("si")) {
					System.out.println("Ingrese el ISBN del libro");
					buscador = leer.nextLong();
					if (buscador == almacen.get(i).getISBM()) {
						almacen.get(i).setEstado(false);
						almacen.get(i).setPrestado("\0");
						System.out.println(almacen.get(i).toString());
						System.out.println("Libro registrado la devolucion de forma exitosa 7u7");
						break;
					}
				} else {
					break;
				}
			}
		}
	}
}
