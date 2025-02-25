package PaqueteLibros;

public class Prestamo {

	//Atributos
	
		private String codPrest;
		private String codUsuarios;
		private String codEjem;
	
	//Metodos
		public Prestamo(String codPrest, String codUsuarios, String codEjem) {
			this.codPrest = codPrest;
			this.codUsuarios = codUsuarios;
			this.codEjem = codEjem;
		}
		
			////////////////GETTERS Y SETTERS ///////////////////////
		
		public String getCodPrest() {
			return codPrest;
		}

		public void setCodPrest(String codPrest) {
			this.codPrest = codPrest;
		}

		public String getCodUsuarios() {
			return codUsuarios;
		}

		public void setCodUsuarios(String codUsuarios) {
			this.codUsuarios = codUsuarios;
		}

		public String getCodEjem() {
			return codEjem;
		}

		public void setCodEjem(String codEjem) {
			this.codEjem = codEjem;
		}
		
		
}
