package Atividade04;

public class Gerente extends Funcionario{
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double bonus() {
		return this.getSalario()*0.2;
	}
	
}
