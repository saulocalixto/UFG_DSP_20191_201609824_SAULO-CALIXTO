package br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeArquivo {

    private String pathArquivo;

    public LeitorDeArquivo(String pathArquivo) {
        this.pathArquivo = pathArquivo;
    }

    public void imprimeConteudoNoConsole() {
        try {
            File file = new File(pathArquivo);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> retorneLinha() {
        List<String> linhas = new ArrayList<String>();

        try {
            String linha;
            BufferedReader br = retorneBufferReader();
            while((linha = br.readLine()) != null){
                if(linha != null && !linha.equals("")) {
                    linhas.add(linha);
                }
            }
        } catch(NullPointerException ex) {
            System.out.println("Problemas para abrir arquivo, ele foi correamente informado?");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }

    private BufferedReader retorneBufferReader() {
        try {
            File file = new File(pathArquivo);
            FileReader fr = new FileReader(file);
            return new BufferedReader(fr);
        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            return null;
        }
    }

}
