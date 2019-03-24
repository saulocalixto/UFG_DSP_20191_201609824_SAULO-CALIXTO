package br.com.saulocalixto.dsp20191.view;

import java.util.Scanner;

public abstract class MenuPadrao {

    private Scanner reader;
    protected String caminhoArquivo;
    protected String nomeArquivo;
    protected String caminhoCompleto;

    protected Scanner leitor() {
        return reader != null ? reader : (reader = new Scanner(System.in));
    }

    public void informeCaminhoArquivo() {
        System.out.println("Informe o caminho do arquivo ex(src/main/resources/avaliacao.dat): ");

        caminhoCompleto = leitor().nextLine();
    }

    protected void pegueInformacoesArquivo() {
        System.out.println("Informe o caminho do arquivo (ex: src/main/resources/):");
        caminhoArquivo = leitor().nextLine();
        System.out.println("Informe nome do arquivo com a extensão (ex: texto.txt):");
        nomeArquivo = leitor().nextLine();
    }
}
