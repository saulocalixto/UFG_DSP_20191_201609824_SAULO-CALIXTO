package br.com.saulocalixto.dsp20191.aulas0508.utilitario;

import br.com.saulocalixto.dsp20191.utilitario.GeradorDeArquivoPadrao;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeradorDeArquivoDat extends GeradorDeArquivoPadrao {

    public GeradorDeArquivoDat(String pathArquivo, String nomeArquivo) {
        super(pathArquivo, nomeArquivo);
    }

    public void crieArquivo(Object obj) {
        CrieDiretorio();
        try {
            FileOutputStream arquivo = new FileOutputStream(pathArquivo.concat("/" + nomeArquivo), true);
            DataOutputStream dataOut = new DataOutputStream(arquivo);
            dataOut.writeUTF(obj.toString());
            dataOut.writeUTF(System.lineSeparator());
            dataOut.flush();
            dataOut.close();
        } catch (IOException e) {
            System.out.println("Problema na leitura.");
        }
    }
}
