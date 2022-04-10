package Atividade03;

public class Main {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		System.out.println(circulo.quantidadeDeLados());
		System.out.println(circulo.cor());
		System.out.println(circulo.area(3.14, 5));
		
		Quadrado quadrado = new Quadrado();
		System.out.println(quadrado.quantidadeDeLados());
		System.out.println(quadrado.cor());
		System.out.println(quadrado.area(4, 4));
		
		TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();
		System.out.println(trianguloRetangulo.quantidadeDeLados());
		System.out.println(trianguloRetangulo.cor());
		System.out.println(trianguloRetangulo.area(4, 7));	
		
		Retangulo retangulo = new Retangulo();
		System.out.println(retangulo.quantidadeDeLados());
		System.out.println(retangulo.cor());
		System.out.println(retangulo.area(5, 8));	

	}

}
