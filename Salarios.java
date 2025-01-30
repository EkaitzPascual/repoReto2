package PaqueteLibros;

public class Salarios {

	//Atributos
	
		private Empleado empleado;
		private Double salarioBase;
		private Double bonificaciones;
		
		public Salarios(Empleado empleado, double salarioBase, double bonificaciones) {
			this.empleado = empleado;
			this.salarioBase = salarioBase;
			this.bonificaciones = bonificaciones;
		}
		
	//Metodos
		
		public double calcularSalarioFinal() {
			return salarioBase + bonificaciones;
		}
		
		public void generarRecibo(){
			System.out.println("Recibo generado para el empleado: " + empleado.getNombre());
			System.out.println("Salario final: $" + calcularSalarioFinal());
		}

}
