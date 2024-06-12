package apps.telefone;

public class Teams implements Telefone {
	public void ligar() {
		System.out.println("Discando... Aguarde até completar a sua ligação");
		
	}
	public void atender() {
		System.out.println("Atendendo a ligação com MS Teams...");
		
	}
	public void iniciarCorreioDeVoz() {
		System.out.println("Chamada não atendida iniciando correio de voz...");
		
	}

}
