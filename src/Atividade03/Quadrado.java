package Atividade03;

public class Quadrado {
	public String quantidadeDeLados() {
		return "Quadrado tem 4 lados";
	}
	public String cor() {
		return "Azul";
	}
	public double area (double a, double b) {
		if(a != b) {
			System.err.println("Quadrado inválido!");
			return 0;
		}
		return a*b;
	}
}
