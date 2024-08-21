package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String app;

    public void iniciarAparelho(){
        System.out.println("Inicializando o iphone");
    }

    public void tocar(){
        System.out.println("Tocando música pelo Ipod... ");
    }
    public void pausar(){
        System.out.println("Pausando música pelo Ipod... ");
    }
    public void aumentarVolume(){
        System.out.println("Aumentando volume pelo Ipod... ");
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo volume pelo Ipod... ");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica " + musica + " pelo Ipod... ");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo a página " + url + " pelo Ipod...");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba do navegador adicionada pelo Iphone...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página pelo Iphone...");
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero + " pelo Iphone... ");
    }
    public void atender(){
        System.out.println("Atendendo chamada pelo Iphone... ");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio voz pelo Iphone...");
    }



    public String getApp() {
        return app;
    }


    public void setApp(String app) {
        this.app = app;
    }
}