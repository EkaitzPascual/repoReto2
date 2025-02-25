package PaqueteLibros;

public class Usuario {

	//Atributos
	
		private String codUsuarios;
		private String nombre;
		private String estado;
	
	//Metodos
		
		public Usuario(String codUsuarios, String nombre, String estado) {
			this.codUsuarios = codUsuarios;
			this.nombre = nombre;
			this.estado = estado;
		}
		
			////////////////GETTERS Y SETTERS ///////////////////////

		public String getCodUsuarios() {
			return codUsuarios;
		}

		public void setCodUsuarios(String codUsuarios) {
			this.codUsuarios = codUsuarios;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
}
