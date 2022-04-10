package Atividade02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Float> notasProva = new ArrayList<Float>();
		notasProva.add(70.0f);
		notasProva.add(80.0f);
		float notaTrabalho = 85.0f;
		
		Aluno aluno = new Aluno();
		aluno.setNotaTrabalho(notaTrabalho);
		aluno.setNotasProva(notasProva);
		
		float result = aluno.calcularMedia(notasProva, notaTrabalho);
		aluno.verificarSeEstaAprovado();
		

	}

}
