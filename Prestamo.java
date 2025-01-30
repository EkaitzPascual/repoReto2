package PaqueteLibros;

public class Prestamo {

	//Atributos
	
		Usuario usuario;
		private Libro libro;
		int diasPrestamo;
		private int diasVencidos;
		private String estado;
		private int dias;
		
		public Prestamo(Usuario usuario, Libro libro, int diasPrestamo) {
			this.usuario = usuario;
			this.libro = libro;
			this.diasPrestamo = diasPrestamo;
			this.diasVencidos = 0;
			this.estado = "activo";
		}
		
	//Metodos
		
		public void registrarRetraso() {
			if (dias > 0) {
	            this.diasVencidos = dias;
	            System.out.println("Se han registrado " + dias + " días de retraso en la devolución.");
	        } else {
	            System.out.println("No hay retraso registrado.");
	        }
		}
		
		public void calcularMulta(){
			if (diasVencidos > 0) {
	            double multa = diasVencidos * 2.0;
	            System.out.println("Multa por retraso: $" + multa);
	        } else {
	            System.out.println("No hay multa, el préstamo está en regla.");
	        }
		}
		
		public void finalizarPrestamo() {
	        if (estado.equals("activo")) {
	            estado = "completado";
	            System.out.println("El préstamo del libro " + libro.getTitulo() + " ha sido completado.");
	        } else {
	            System.out.println("Este préstamo ya fue completado.");
	        }
	    }

}
