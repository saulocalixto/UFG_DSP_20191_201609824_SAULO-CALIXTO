package br.com.saulocalixto.dsp20191.aulas0104.ap;

import br.com.saulocalixto.dsp20191.aulas0104.ap.view.MenuView;

/**
 * Created by Saulo Calixto on 13/03/19.
 */
public class main {
    public static void main (String args[]) {
        /**
         * Criei um menu para a aplicação.
         * Se escolher a opção 1 você poderá criar um arquivo e adicionar linhas a esse arquivo.
         * Com a opção 2 você pode adicionar linhas a um arquivo já existente.
         * Com a opção 3 ele vai imprimir as linhas de um arquivo.
         * Na opção 3 também é possível imprimir os arquivos do csv, contudo foi necessário colocar um desvio
         * pois foi solicitado que os dados fossem colocados em uma lista e depois impressos.
         * Todos os exercícios são contemplados dessa forma.
         */
        MenuView menu = new MenuView();
        menu.executeMenu();

    }
}
