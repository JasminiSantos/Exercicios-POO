package Atividade04;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("André", "84248242428", 2500.00);
		System.out.println(gerente.bonus());
		
		Vendedor vendedor = new Vendedor("Paula", "44724824724", 1700.00);
		System.out.println(vendedor.bonus());
	}

}
