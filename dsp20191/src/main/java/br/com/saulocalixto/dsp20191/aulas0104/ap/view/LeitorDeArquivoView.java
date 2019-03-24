package br.com.saulocalixto.dsp20191.aulas0104.ap.view;

import br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario.LeitorDeArquivo;
import br.com.saulocalixto.dsp20191.aulas0104.ap.model.UnidadeFederacao;
import br.com.saulocalixto.dsp20191.view.MenuPadrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorDeArquivoView extends MenuPadrao {

    private String pathArquivo;

    public void executeMenuCriarArquivo() {
        System.out.println("Imprimir Unidades da Federação (0 - Não, 1 - Sim): ");
        int ehParaImprimirUF = leitor().nextInt();

        System.out.println("Informe o caminho completo do arquivo (ex: src/main/texto.txt");
        pathArquivo = leitor().nextLine();

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
