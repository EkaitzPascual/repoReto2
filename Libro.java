package PaqueteLibros;

public class Libro {
	
	//Atributos
	
	String titulo;
	String autor;
	String isbn;
	int aniopublicación;
	String estado;
	
	public Libro(String titulo, String autor, String isbn, int aniopublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.aniopublicación = aniopublicacion;
		this.estado = "disponible";
	}
	
	//Metodos
	
	public void prestar() {
		if (estado.equals("disponible")) {
			estado = "prestado";
			System.out.println("El libro ha sido prestado.");
		}else {
			System.out.println("El libro no esta disponible");
		}
	}
	
	public void devolver(){
		if (estado.equals("prestado")) {
			estado = "disponible";
			System.out.println("El libro ha sido devuleto.");
		}else {
			System.out.println("El libro no estaba prestado");
		}

	}
	
	public void reservar() {
		if (estado.equals("disponible")) {
			estado = "reservado";
			System.out.println("El libro ha sido reservado.");
		}else {
			System.out.println("El libro no esta disponible para reservar");
		}

	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getAutor() {
		return autor;
	}

}