package br.com.saulocalixto.dsp20191;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base.PersistenciaJdbc;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaCargos;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaDepartamentos;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaFuncionarios;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao.AlteraDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsulteDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete.DeleteDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteDepartamento;
import br.com.saulocalixto.dsp20191.view.MenuView;
import java.util.ArrayList;
import java.util.List;

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
