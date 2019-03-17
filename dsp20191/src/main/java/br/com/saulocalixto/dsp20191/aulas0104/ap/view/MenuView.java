package br.com.saulocalixto.dsp20191.aulas0104.ap.view;

import java.util.Scanner;

public class MenuView {

    Scanner reader;

    public MenuView() {
        reader = new Scanner(System.in);
    }

    public void executeMenu() {
        int escolha = -1;

        while (escolha != 0) {
            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Adicionar linhas a arquivo existente");
            System.out.println("3 - Imprimir conteúdo de arquivo");
            System.out.println("0 - Sair");

            escolha = reader.nextInt();

            acoesMenu(escolha);
        }
        System.out.println("Foi um prazer tê-lo por perto!");
    }

    private void acoesMenu(int escolha) {
        CriarArquivoView criarArquivo = new CriarArquivoView(reader);
        LeitorDeArquivoView leitorArquivo = new LeitorDeArquivoView(reader);
        switch (escolha) {
            case 1:
                criarArquivo.executeMenuCriarArquivo();
                break;
            case 2:
                criarArquivo.executeMenuEscreverLinha();
                break;
            case 3:
                leitorArquivo.executeMenuCriarArquivo();
                break;
        }
    }
}
