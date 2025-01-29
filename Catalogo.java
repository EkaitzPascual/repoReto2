package PaqueteLibros;

public class Catalogo {
	//Atributos
	
		Libro libro1;
		Libro libro2;
		Libro libro3;
		Libro libro4;
		Libro libro5;
		
		public Catalogo(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {
			this.libro1 = libro1;
			this.libro2 = libro2;
			this.libro3 = libro3;
			this.libro4 = libro4;
			this.libro5 = libro5;
		}
		
	//Metodos
		
		public void buscarLibro() {
			if (libro1.getTitulo().contains("criterio") || libro1.getAutor().contains("criterio")) {
				System.out.println("Libro encontrado: " + libro1.getTitulo());
			}
			if (libro2.getTitulo().contains("criterio") || libro2.getAutor().contains("criterio")) {
				System.out.println("Libro encontrado: " + libro2.getTitulo());
			}
			if (libro3.getTitulo().contains("criterio") || libro3.getAutor().contains("criterio")) {
				System.out.println("Libro encontrado: " + libro3.getTitulo());
			}
			if (libro4.getTitulo().contains("criterio") || libro4.getAutor().contains("criterio")) {
				System.out.println("Libro encontrado: " + libro4.getTitulo());
			}
			if (libro5.getTitulo().contains("criterio") || libro5.getAutor().contains("criterio")) {
				System.out.println("Libro encontrado: " + libro5.getTitulo());
			}
		}
		
		public void mostrarDisponibles(){
			System.out.println("Libros disponibles: ");
			if (libro1.getEstado().equals("disponible")) {
				System.out.println("-" + libro1.getTitulo());
			}
			System.out.println("Libros disponibles: ");
			if (libro2.getEstado().equals("disponible")) {
				System.out.println("-" + libro2.getTitulo());
			}
			System.out.println("Libros disponibles: ");
			if (libro3.getEstado().equals("disponible")) {
				System.out.println("-" + libro3.getTitulo());
			}
			System.out.println("Libros disponibles: ");
			if (libro4.getEstado().equals("disponible")) {
				System.out.println("-" + libro4.getTitulo());
			}
			System.out.println("Libros disponibles: ");
			if (libro5.getEstado().equals("disponible")) {
				System.out.println("-" + libro5.getTitulo());
			}
		}
		
}
