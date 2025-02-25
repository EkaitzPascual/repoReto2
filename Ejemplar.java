package PaqueteLibros;

public class Ejemplar {

	//Atributos
	
		private String codEjem;
		private String isbn;
		
	//Metodos
		public Ejemplar(String codEjem, String isbn) {
			this.codEjem = codEjem;
			this.isbn = isbn;
		}
		
			////////////////GETTERS Y SETTERS ///////////////////////
		
		public String getCodEjem() {
			return codEjem;
		}

		public void setCodEjem(String codEjem) {
			this.codEjem = codEjem;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		
}
