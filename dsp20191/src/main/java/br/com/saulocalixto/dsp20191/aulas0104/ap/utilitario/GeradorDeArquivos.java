package br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario;

import java.io.*;

public class GeradorDeArquivos {

    private String pathArquivo;
    private String nomeArquivo;

    public GeradorDeArquivos(String pathArquivo, String nomeArquivo) {
        this.pathArquivo = pathArquivo;
        this.nomeArquivo = nomeArquivo;
    }

    public void crieArquivoDeTexto() {
        PrintWriter arquivo = pegueArquivo();
        arquivo.close();
    }

    public void escrevaEmArquivo(String[] linhas) {
        PrintWriter arquivo = pegueArquivo();

        for (String linha:linhas) {
            if(linha != null) {
                arquivo.println(linha);
            }
        }

        arquivo.close();
    }

    private void CrieDiretorio(String pathArquivo) {
        File diretorioDoArquivo = new File(pathArquivo);

        if (!diretorioDoArquivo.exists()){
            diretorioDoArquivo.mkdir();
        }
    }

    private PrintWriter pegueArquivo() {
        try {
            CrieDiretorio(pathArquivo);
            FileWriter caminheCompleto = new FileWriter(pathArquivo.concat("/" + nomeArquivo), true);
            PrintWriter arquivo = new PrintWriter(caminheCompleto);

            return arquivo;
        } catch (IOException e) {
            System.out.println("Problema na leitura do arquivo, caminho ou arquivo inexistente.");
            return null;
        }
    }
}
