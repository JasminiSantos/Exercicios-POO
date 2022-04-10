package Atividade03;

public class Circulo implements FormaGeometrica{
	public String quantidadeDeLados() {
		return "Círculo não tem lados";
	}
	public String cor() {
		return "Verde";
	}
	public double area (double a, double b) {
		a = 3.14;
		return a*(b*b);
	}
}
