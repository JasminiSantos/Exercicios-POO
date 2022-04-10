package Atividade01;
public class ControleRemoto {
	
	public void aumentarVolume(TV tv) {
		if(tv.getVolume() != 10) {
			tv.setVolume(tv.getVolume() + 1);
		}else {
			System.out.println("Volume já está no mínimo");
		}
	}
	public void diminuirVolume(TV tv) {
		if(tv.getVolume() > 0) {
			tv.setVolume(tv.getVolume() - 1);	
		}else {
			System.out.println("Volume já está no máximo");
		}
	}
	public void trocarCanal(TV tv, int canalEscolhido) {
		if(canalEscolhido >= 1 && canalEscolhido <= 10) {
			if(canalEscolhido == tv.getCanal()) {
				System.out.println("Está no mesmo canal");
			}
			else {
				tv.setCanal(canalEscolhido);				
			}
		}
		else {
			System.out.println("Canal inválido");
		}
	}
	
	
}
