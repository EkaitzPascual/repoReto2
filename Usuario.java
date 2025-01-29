package PaqueteLibros;

public class Usuario {

	//Atributos
	
		String nombre;
		String idUsuario;
		String ultimoLibroPrestado;
		Libro libroActual1;
		Libro libroActual2;
		private Libro libro;
		
		public Usuario(String nombre, String idUsuario) {
			this.nombre = nombre;
			this.idUsuario = idUsuario;
			this.ultimoLibroPrestado = null;
			this.libroActual1 = null;
			this.libroActual2 = null;
		}
		
	//Metodos
	
		public void solicitarPrestamo() {
			if (libro.getEstado().equals("disponible")) {
				
				if (libroActual1 == null) {
					libroActual1 = libro;
					libro.prestar();
					ultimoLibroPrestado = libro.getTitulo();
					System.out.println(nombre + "ha solicitado el libro: " + libro.getTitulo());
				} else if (libroActual2 == null) {
					libroActual2 = libro;
					libro.prestar();
					ultimoLibroPrestado = libro.getTitulo();
					System.out.println(nombre + "ha solicitado el libro: " + libro.getTitulo());
				} else {
					System.out.println(nombre + "ya tiene el maximo permitido de libros en prestamo.");
				}
			} else {
				System.out.println("El libro no esta disponible para prestamo.");
			}
		}
	
		public void devolverLibro() {
			if (libroActual1 == libro) {
				libro.devolver();
				libroActual1 = null;
				System.out.println(nombre + "ha devuleto el libro: " + libro.getTitulo());
			} else if (libroActual2 == libro) {
				libro.devolver();
				libroActual2 = null;
				System.out.println(nombre + "ha devuleto el libro: " + libro.getTitulo());
			} else {
				System.out.println("El libro no pertenece a los prestamos actuales de " + nombre + ".");
			}
		}
	
		public void consultarHistorial() {
			if (ultimoLibroPrestado != null) {
				System.out.println("Ultimo libro prestado por " + nombre + ":" + ultimoLibroPrestado);
			} else {
				System.out.println(nombre + "no tiene historial de prestamos");
			}
		}

}
