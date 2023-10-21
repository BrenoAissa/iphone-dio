public class Iphone implements AppMusical, AppChamada, AppNavegador{
    @Override
    public void tocar() {
        AppMusical.super.tocar();
        System.out.println("Tocando...");
    }
    @Override
    public void pausar() {
        AppMusical.super.pausar();
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        AppMusical.super.selecionarMusica();
        System.out.println("Selecionando musica...");
    }

    @Override
    public void ligar() {
        AppChamada.super.ligar();
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        AppChamada.super.atender();
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        AppChamada.super.iniciarCorreioVoz();
        System.out.println("Iniciando correio...");
    }

    @Override
    public void exibirPagina() {
        AppNavegador.super.exibirPagina();
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        AppNavegador.super.adicionarNovaAba();
        System.out.println("Adicionando nova página...");
    }

    @Override
    public void atualizarPagina() {
        AppNavegador.super.atualizarPagina();
        System.out.println("Atualizando página...");
    }
}
