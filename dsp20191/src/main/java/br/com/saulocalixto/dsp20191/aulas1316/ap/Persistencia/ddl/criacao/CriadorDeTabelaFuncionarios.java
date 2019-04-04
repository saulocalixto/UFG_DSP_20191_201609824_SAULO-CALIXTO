package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

/**
 * Created by aluno on 03/04/19.
 */
public class CriadorDeTabelaFuncionarios extends CriadorDeTabela {
    @Override
    public String ScriptDeCriacaoDaTabela() {
        return "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID_FUNCIONARIO LONG NOT NULL PRIMARY KEY,\n" +
                "MATRICULA LONG NOT NULL," +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";
    }

    @Override
    public String NomeTabela() {
        return "FUNCIONARIOS";
    }
}
