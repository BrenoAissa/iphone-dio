import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        System.out.println("\t----MENU----\n" +
                            "1. Musica\n" +
                            "2. Chamada\n" +
                            "3. Navegador");
        int opcaoMenu = sc.nextInt();
        if(opcaoMenu == 1){
            System.out.println("\t---SUBMENU---\n" +
                                "1. Tocar Musica\n" +
                                "2. Pausar Musica\n" +
                                "3. Selecionar Musica +");
            int opcaoSubMenuMusica = sc.nextInt();
            switch (opcaoSubMenuMusica){
                case 1:
                    iphone.tocar();
                    break;
                case 2:
                    iphone.pausar();
                    break;
                case 3:
                    iphone.selecionarMusica();
                    break;
                default:
                    System.out.println("Opção inexistente\nEncerrando...");
                    break;
            }
        }
        else if (opcaoMenu == 2){
            System.out.println("\t---SUBMENU---\n" +
                                "1. Ligar\n" +
                                "2. Atender\n" +
                                "3. Correio de voz");
            int opcaoSubMenuChamada = sc.nextInt();
            switch (opcaoSubMenuChamada){
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                default:
                    System.out.println("Opção inexistente\nEncerrando...");
                    break;
            }
        }

        else if (opcaoMenu == 3){
            System.out.println("\t---SUBMENU---\n" +
                    "1. Exibir Pagina\n" +
                    "2. Nova aba\n" +
                    "3. Atualizar Pagina +");
            int opcaoSubMenuNavegador = sc.nextInt();
            switch (opcaoSubMenuNavegador){
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                default:
                    System.out.println("Opção inexistente\nEncerrando...");
                    break;
            }
        }
        else{
            System.out.println("Função invalida\nEncerrando...");
        }

    }
}