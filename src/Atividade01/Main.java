package Atividade01;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV();
		ControleRemoto controleRemoto = new ControleRemoto();
		
		controleRemoto.aumentarVolume(tv);
		controleRemoto.aumentarVolume(tv);
		controleRemoto.aumentarVolume(tv);
		controleRemoto.aumentarVolume(tv);
		controleRemoto.diminuirVolume(tv);
		
		System.out.println(tv.getVolume());
		controleRemoto.trocarCanal(tv, 1);
	}

}
