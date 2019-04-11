package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

/**
 * Created by aluno on 03/04/19.
 */
public class CriadorDeTabelaDepartamentos extends CriadorDeTabela {

    @Override
    public String ScriptDeCriacaoDaTabela() {
        return "CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(\n" +
                "ID_DEPARTAMENTO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";
    }

    @Override
    public String NomeTabela() {
        return "DEPARTAMENTOS";
    }
}
