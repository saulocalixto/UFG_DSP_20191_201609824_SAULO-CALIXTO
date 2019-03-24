package br.com.saulocalixto.dsp20191.view;

import br.com.saulocalixto.dsp20191.aulas0104.ap.view.CriarArquivoView;
import br.com.saulocalixto.dsp20191.aulas0104.ap.view.LeitorDeArquivoView;
import br.com.saulocalixto.dsp20191.aulas0508.view.AlunoView;

import java.util.Scanner;

public class MenuView extends MenuPadrao {

    public void executeMenu() {
        int escolha = -1;

        while (escolha != 0) {
            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Adicionar linhas a arquivo existente");
            System.out.println("3 - Imprimir conteúdo de arquivo");
            System.out.println("4 - Gestão de notas");
            System.out.println("0 - Sair");

            escolha = leitor().nextInt();
            leitor().nextLine();

            acoesMenu(escolha);
        }
        System.out.println("Foi um prazer tê-lo por perto!");
    }

    private void acoesMenu(int escolha) {
        CriarArquivoView criarArquivo = new CriarArquivoView();
        LeitorDeArquivoView leitorArquivo = new LeitorDeArquivoView();
        AlunoView alunoView = new AlunoView();
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
            case 4:
                alunoView.acoesMenu();
                break;
        }
    }
}
