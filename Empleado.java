package PaqueteLibros;

public class Empleado {

	//Atributos
	
		String nombre;
		String idEmpleado;
		String cargo;
		
		public Empleado(String nombre, String idEmpleado, String cargo) {
			this.nombre = nombre;
			this.idEmpleado = idEmpleado;
			this.cargo = cargo;
		}
		
	//Metodos
		
		public void gestionarInventario(Libro libro, String accion) {
			switch (accion.toLowerCase()) {
				case "agregar":
					System.out.println("El libro" + libro.getTitulo() + "ha sido agregado al inventario.");
					break;
				case "eliminar":
					System.out.println("El libro" + libro.getTitulo() + "ha sido eliminado del inventario");
					break;
				case "actualizar":
					System.out.println("El libro" + libro.getTitulo() + "ha sido actualizado.");
					break;
				default:
					System.out.println("Accion no reconocida.");
			}
		}
		
		public void asistirUsuario(){
			System.out.println("Asistiendo al usuario con sus consulatas.");
		}
	

		public String getNombre() {
			return nombre;
		}
}
