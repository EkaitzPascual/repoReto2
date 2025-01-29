package PaqueteLibros;

public class Prestamo {

	//Atributos
	
		Usuario usuario;
		Libro libro;
		int diasPrestamos;
		int diasVencidos;
		String estado;
		
		public Prestamo(Usuario usuario, Libro libro, int diasPrestamos, int diasVencidos, String estado) {
			this.usuario = usuario;
			this.libro = libro;
			this.diasPrestamos = diasPrestamos;
			this.diasVencidos = diasVencidos;
			this.estado = "activo";
		}
		
	//Metodos
		
		public void registrarRetraso(int dias) {
			if (dias > 0) {
				this.diasVencidos = dias;
				System.out.println("Se han registrado" + dias + "dias de retraso en la devolucion.");
			} else {
				System.out.println("No hay retraso registrado.");
			}
		}
		
		public void calcularMulta(){
			if (diasVencidos > 0) {
				double multa = diasVencidos * 2.0;
				System.out.println("Multa por retraso: $" + multa);
			} else {
				System.out.println("No hay multa, el prestamo esta en regla.");
			}
		}
		
		public void finalizarPrestamo() {
			if (estado.equals("activo")) {
				estado = "completado";
				System.out.println("El prestamo del libro: " + libro.getTitulo() + "ha sido completado.");
			}
		}
}
