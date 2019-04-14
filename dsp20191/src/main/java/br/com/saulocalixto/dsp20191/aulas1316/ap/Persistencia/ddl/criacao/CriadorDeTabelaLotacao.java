/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

/**
 *
 * @author Alunoinf_2
 */
public class CriadorDeTabelaLotacao extends CriadorDeTabela {

    @Override
    public String ScriptDeCriacaoDaTabela() {
        return "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID_LOTACOES LONG NOT NULL PRIMARY KEY,\n" +
                "DATAINICIAL DATE NOT NULL," +
                "DATAFINAL DATE NOT NULL," +
                "ID_CARGO LONG NOT NULL," +
                "ID_DEPARTAMENTO LONG NOT NULL," +
                "ID_FUNCIONARIO LONG NOT NULL\n" +
                ")";
    }

    @Override
    public String NomeTabela() {
        return "LOTACOES";
    }
}
