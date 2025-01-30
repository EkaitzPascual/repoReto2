package PaqueteLibros;

public class Horarios {

	//Atributos
	
		private Empleado empleado;
		private int diasTrabajados;
		private int horasExtra;
		
		public Horarios(Empleado empleado, int diasTrabajados, int horasExtra) {
			this.empleado = empleado;
			this.diasTrabajados = diasTrabajados;
			this.horasExtra = horasExtra;
		}
		
	//Metodos
		
		public int calcularHorasTotales() {
			return (diasTrabajados * 8) + horasExtra;
		}
		
		public void asignarHorario(){
			System.out.println("Horario asignado para el empleado: " + empleado.getNombre());
		}
		
	
}
