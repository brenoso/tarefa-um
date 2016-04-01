package imc;

public class Principal {

	public static void main(String[] args) {

		Paciente alex = new Paciente(65, 1.60);
		Paciente breno = new Paciente(75, 1.75);
		Paciente mae = new Paciente(72, 1.60);
		
		System.out.println("IMC do Alex: " +alex.calcularIMC());
		System.out.println("IMC do Breno: " +breno.calcularIMC());
		System.out.println("IMC da Mae: " +mae.calcularIMC());
		
		System.out.println("\nDiagn�stico do Alex: " +alex.diagnostico());
		System.out.println("Diagn�stico do Breno: " +breno.diagnostico());
		System.out.println("Diagn�stico da Mae: " +mae.diagnostico());
	}

}
