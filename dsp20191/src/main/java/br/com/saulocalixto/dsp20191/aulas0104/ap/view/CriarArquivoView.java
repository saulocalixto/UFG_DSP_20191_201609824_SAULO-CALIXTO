package br.com.saulocalixto.dsp20191.aulas0104.ap.view;

import br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario.GeradorDeArquivos;
import br.com.saulocalixto.dsp20191.view.MenuPadrao;

public class CriarArquivoView extends MenuPadrao {

    public void executeMenuCriarArquivo() {

        crieArquivo();

        preenchaLinha();
    }

    public void executeMenuEscreverLinha() {
        pegueInformacoesArquivo();

        preenchaLinha();
    }

    private void preenchaLinha() {
        String escolha = "";
        int i = 0;

        String[] linhas = new String[20];

        while(!escolha.equals("0") && i <= 20) {
            System.out.println("Digite uma nova linha ou '0' para finalizar:");
            escolha = leitor().nextLine();
            if(!escolha.equals("0")) {
                linhas[i] = escolha;
            }
            i++;
        }

        retorneGeradorDeArquivo().escrevaEmArquivo(linhas);
    }

    private void crieArquivo() {
        pegueInformacoesArquivo();
        GeradorDeArquivos geradorDeArquivos = retorneGeradorDeArquivo();
        geradorDeArquivos.crieArquivoDeTexto();
    }

    private GeradorDeArquivos retorneGeradorDeArquivo() {
        return new GeradorDeArquivos(
                caminhoArquivo,
                nomeArquivo);
    }
}
