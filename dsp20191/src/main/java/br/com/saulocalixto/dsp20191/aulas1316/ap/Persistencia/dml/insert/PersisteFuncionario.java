/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

/**
 *
 * @author Alunoinf_2
 */
public class PersisteFuncionario extends ManipulacaoBdPadrao<Funcionario> {

    public PersisteFuncionario(Funcionario objeto) {
        super(objeto);
    }
    
    @Override
    protected String comandoSqlParaExecutar() {
        return "INSERT INTO " + nomeTabela()  +
                " VALUES('" + objeto.getId() +
                "','" + objeto.getMatricula() +
                "','" + objeto.getNome() +
                "')";
    }

    @Override
    protected String nomeTabela() {
        return "FUNCIONARIOS";
    }
    
}
