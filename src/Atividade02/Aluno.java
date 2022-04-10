package Atividade02;

import java.util.ArrayList;

public class Aluno {
	private int matricula;
	private String nome;
	private ArrayList<Float> notasProva;
	private Float notaTrabalho;
	
	public float calcularMedia(ArrayList<Float>notasProva, float notaTrabalho) {
		Float media = 0.00f;
		for(int i = 0; i < notasProva.size(); i++) {
			media = media + notasProva.get(i) * 1.5f;
		}
		media = media + notaTrabalho*2;
		media = media/(1.5f + 1.5f + 2);
		return media;
	}
	public void verificarSeEstaAprovado() {
		if(this.calcularMedia(this.getNotasProva(), this.getNotaTrabalho()) >= 70) {
			System.out.println("Aluno está aprovado!");
		}
		else {
			System.out.println("Aluno está reprovado!");			
		}
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Float> getNotasProva() {
		return notasProva;
	}
	public void setNotasProva(ArrayList<Float> notasProva) {
		this.notasProva = notasProva;
	}
	public Float getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(Float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
}
