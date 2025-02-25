package PaqueteLibros;

public class Libro {
	
	//Atributos
		private String isbn;
		private String idioma;
		private int numCopiasExistentes;
	
	//Metodos
		public Libro(String isbn, String idioma, int numCopiasExistentes) {
			this.isbn = isbn;
			this.idioma = idioma;
			this.numCopiasExistentes = numCopiasExistentes;
		}
		
			////////////////GETTERS Y SETTERS ///////////////////////
		
		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public int getNumCopiasExistentes() {
			return numCopiasExistentes;
		}

		public void setNumCopiasExistentes(int numCopiasExistentes) {
			this.numCopiasExistentes = numCopiasExistentes;
		}
	
		
	
}