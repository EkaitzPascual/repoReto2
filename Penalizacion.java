package PaqueteLibros;

public class Penalizacion {
	//Atributos
	
		private String codPen;
		private String fechaPen;
		private int diasPen;
	
	//Metodos
		public Penalizacion(String codPen, String fechaPen, int diasPen) {
			this.codPen = codPen;
			this.fechaPen = fechaPen;
			this.diasPen = diasPen;
		}

			////////////////GETTERS Y SETTERS ///////////////////////
		
		public String getCodPen() {
			return codPen;
		}

		public void setCodPen(String codPen) {
			this.codPen = codPen;
		}

		public String getFechaPen() {
			return fechaPen;
		}

		public void setFechaPen(String fechaPen) {
			this.fechaPen = fechaPen;
		}

		public int getDiasPen() {
			return diasPen;
		}

		public void setDiasPen(int diasPen) {
			this.diasPen = diasPen;
		}
		
		
		
}
