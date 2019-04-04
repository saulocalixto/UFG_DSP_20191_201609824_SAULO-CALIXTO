package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

/**
 * Created by aluno on 03/04/19.
 */
public class CriadorDeTabelaCargos extends CriadorDeTabela {
    @Override
    public String ScriptDeCriacaoDaTabela() {
        return "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID_DEPARTAMENTO VARCHAR(100) NOT NULL PRIMARY KEY,\n" +
                "SALARIO FLOAT NOT NULL\n" +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";
    }

    @Override
    public String NomeTabela() {
        return "CARGOS";
    }
}
