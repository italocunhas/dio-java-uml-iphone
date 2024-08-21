import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import iphone.Iphone;

import java.util.Scanner;

public class Celular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.iniciarAparelho();
        String app = selecionarApp();
        iphone.setApp(app);

        switch (iphone.getApp()) {
            case "ipod":
                RotinaIpod(iphone);
                break;
            case "browser":
                RotinaBrowser(iphone);
                break;
            case "telefone":
                RotinaTelefone(iphone);
                break;
            default:
                System.out.println("Por favor, selecione um aplicativo válido [Ipod - browser - telefone]");

        }
    }

    public static String selecionarApp(){
        System.out.println("Por favor, selecione um aplicativo: [ipod - browser - telefone]");
        Scanner scanner = new Scanner(System.in);
        String app;
        do{
            app = scanner.nextLine();
            if(!(app.equals("ipod") || app.equals("browser") || app.equals("telefone"))){
                System.out.println("Por favor, o aplicativo deve ser uma das opções: [ipod - browser - telefone]");
            }
        }while(!(app.equals("ipod") || app.equals("browser") || app.equals("telefone")));
        scanner.close();
        return app;
    }

    public static void RotinaIpod(Iphone iphone){
        ReprodutorMusical ipod = iphone;
        ipod.selecionarMusica("Like a rolling stone");
        ipod.tocar();
        ipod.aumentarVolume();
        ipod.diminuirVolume();
        ipod.pausar();
    }
    public static void RotinaBrowser(Iphone iphone){
        NavegadorInternet browser = iphone;
        browser.exibirPagina("http://www.google.com.br");
        browser.adicionarNovaAba();
        browser.atualizarPagina();
    }
    public static void RotinaTelefone(Iphone iphone){
        AparelhoTelefonico tel = iphone;
        tel.ligar("41999867867");
        tel.atender();
        tel.iniciarCorreioVoz();
    }
}