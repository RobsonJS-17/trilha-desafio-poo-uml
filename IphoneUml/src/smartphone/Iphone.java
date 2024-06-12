package smartphone;

import apps.navegadores.Navegador;
import apps.reprodutorMusica.ReprodutorMusical;
import apps.telefone.Telefone;
import apps.navegadores.Chrome;
import apps.reprodutorMusica.Spotify;
import apps.telefone.WhatsApp;

public class Iphone {
    private Navegador navegador;
    private ReprodutorMusical reprodutor;
    private Telefone telefone;

    public Iphone(Navegador navegador, ReprodutorMusical reprodutor, Telefone telefone) {
        this.navegador = navegador;
        this.reprodutor = reprodutor;
        this.telefone = telefone;
    }

    public void usarNavegador() {
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();
    }

    public void usarReprodutor() {
        reprodutor.selecionarMusica();
        reprodutor.tocar();
        reprodutor.pausar();
    }

    public void usarTelefone() {
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioDeVoz();
    }

    public static void main(String[] args) {
        Navegador chrome = new Chrome();
        ReprodutorMusical spotify = new Spotify();
        Telefone whatsapp = new WhatsApp();

        Iphone iphone = new Iphone(chrome, spotify, whatsapp);
        iphone.usarNavegador();
        iphone.usarReprodutor();
        iphone.usarTelefone();
    }
}
		