package imc;

public class Paciente {
	
	private double peso;
	private double altura;

	public Paciente (double peso, double altura ) 
	{
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public double calcularIMC()
	{
		return this.peso / (this.altura * this.altura);
	}
	
	public String diagnostico()
	{
		if (calcularIMC() < 16)
			return "Baixo peso muito grave";
		else if (calcularIMC() > 16 && calcularIMC() < 16.99)
			return "Baixo peso grave";
		else if  (calcularIMC() > 17 && calcularIMC() < 18.49)
			return "Baixo peso";
		else if (calcularIMC() > 18.50 && calcularIMC() < 24.99)
			return "Peso normal";
		else if (calcularIMC() > 25 && calcularIMC() < 29.99)
			return "Sobrepeso";
		else if (calcularIMC() > 30 && calcularIMC() < 34.99)
			return "Obesidade grau I";
		else if (calcularIMC() > 35 && calcularIMC() < 39.99)
			return "Obesidade grau II";
		else if (calcularIMC() >= 40)
			return "Obesidade grau III (obesidade mórbida) ";
			return "";
	}
	
	
	
	
	
	
	
}
