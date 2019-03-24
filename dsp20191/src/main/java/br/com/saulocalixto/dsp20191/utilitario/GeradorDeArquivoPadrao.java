package br.com.saulocalixto.dsp20191.utilitario;

import java.io.File;

public abstract class GeradorDeArquivoPadrao {

    protected String pathArquivo;
    protected String nomeArquivo;

    public GeradorDeArquivoPadrao(String pathArquivo, String nomeArquivo) {
        this.pathArquivo = pathArquivo;
        this.nomeArquivo = nomeArquivo;
    }

    protected void CrieDiretorio() {
        File diretorioDoArquivo = new File(pathArquivo);

        if (!diretorioDoArquivo.exists()){
            diretorioDoArquivo.mkdir();
        }
    }
}
