package br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario;

import br.com.saulocalixto.dsp20191.utilitario.GeradorDeArquivoPadrao;

import java.io.*;

public class GeradorDeArquivos extends GeradorDeArquivoPadrao {

    public GeradorDeArquivos(String pathArquivo, String nomeArquivo) {
        super(pathArquivo, nomeArquivo);
    }

    public void crieArquivoDeTexto() {
        PrintWriter arquivo = pegueArquivo();
        arquivo.close();
    }

    public void escrevaEmArquivo(String[] linhas) {
        PrintWriter arquivo = pegueArquivo();

        for (String linha:linhas) {
            if(linha != null) {
                arquivo.print(linha);
                arquivo.println();
            }
        }

        arquivo.flush();
        arquivo.close();
    }

    private PrintWriter pegueArquivo() {
        try {
            CrieDiretorio();
            FileWriter caminheCompleto = new FileWriter(pathArquivo.concat("/" + nomeArquivo), true);
            PrintWriter arquivo = new PrintWriter(caminheCompleto);
            return arquivo;
        } catch (IOException e) {
            System.out.println("Problema na leitura do arquivo, caminho ou arquivo inexistente.");
            return null;
        }
    }
}
