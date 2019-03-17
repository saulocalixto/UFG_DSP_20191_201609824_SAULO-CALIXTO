package br.com.saulocalixto.dsp20191.aulas0104.ap.view;

import br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario.LeitorDeArquivo;
import br.com.saulocalixto.dsp20191.aulas0104.ap.model.UnidadeFederacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorDeArquivoView {

    private Scanner reader;
    private String pathArquivo;

    public LeitorDeArquivoView(Scanner reader) {
        this.reader = reader;
    }

    public void executeMenuCriarArquivo() {
        System.out.println("Imprimir Unidades da Federação (0 - Não, 1 - Sim): ");
        int ehParaImprimirUF = reader.nextInt();

        System.out.println("Informe o caminho completo do arquivo (ex: src/main/texto.txt");
        pathArquivo = reader.next();

        if(ehParaImprimirUF == 1) {
            imprimaUFs();

        } else {
            retorneLeitor().imprimeConteudoNoConsole();
        }
    }

    private void imprimaUFs() {
        List<String> linhas = retorneLeitor().retorneLinha();
        List<UnidadeFederacao> unidadesFederacao = new ArrayList<UnidadeFederacao>();

        for (String linha : linhas) {
            UnidadeFederacao unidade = new UnidadeFederacao(linha);
            unidadesFederacao.add(unidade);
        }

        for (UnidadeFederacao unidade: unidadesFederacao) {
            System.out.println(unidade.toString());
        }
    }

    private LeitorDeArquivo retorneLeitor() {
        return new LeitorDeArquivo(pathArquivo);
    }
}
