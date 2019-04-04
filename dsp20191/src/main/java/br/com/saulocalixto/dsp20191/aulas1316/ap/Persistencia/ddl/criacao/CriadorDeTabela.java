package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

/**
 * Created by aluno on 03/04/19.
 */

import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base.PersistenciaJdbc;

abstract class CriadorDeTabela extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception {
        preparaPersistencia();

        System.out.println("Criando a tabela " + NomeTabela());

        String sql = ScriptDeCriacaoDaTabela();

        stmt.executeUpdate(sql);

        System.out.println("Tabela " + NomeTabela() + " criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

    public abstract String ScriptDeCriacaoDaTabela();

    public abstract String NomeTabela();
}
