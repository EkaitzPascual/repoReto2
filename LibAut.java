package PaqueteLibros;

public class LibAut {

	//Atributos
	
		private String isbn;
		private String dni;
		
	//Metodos
		public LibAut(String isbn, String dni) {
			this.isbn = isbn;
			this.dni = dni;
		}
		
			////////////////GETTERS Y SETTERS ///////////////////////
		
		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}
		
		
}
