package Atividade04;

public class Vendedor extends Funcionario{
	public Vendedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double bonus() {
		return this.getSalario()*0.10;
	}
}
