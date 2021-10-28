package practica2;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu = "== BIBLIOTECA MUNICIPAL ==\r\n" + "1. Ingresar un libro\r\n" + "2. Listar los libros\r\n"
				+ "3. Prestar un libro\r\n" + "4. Devolver un libro\r\n" + "0. Salir\r\n" + "Ingrese su opción:\r\n";
		bibloteca b = new bibloteca();
		int opcion = 0;
		do {
			System.out.print(menu);
			opcion = b.leer.nextInt();
			switch (opcion) {
			

			case 1:
				b.add_libros();
				break;
			case 2:
				b.listar();
				break;
			case 3:
				b.prestar();
				break;
			case 4:
				b.prestar();
				break;
			case 0:
				System.out.println("Desea salir? si o no:");
				String respuesta = b.leer.next();
				if (respuesta.toLowerCase().equals("si")) {
					System.out.println("\nGracias por usar el programa lindowo");
					opcion=165461531;
					break;
				}
			default:
				break;
			}
		} while (opcion != 165461531);
	}
}
