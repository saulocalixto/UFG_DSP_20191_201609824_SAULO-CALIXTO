/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;

/**
 *
 * @author Alunoinf_2
 */
public class PersisteDepartamento extends PersistePadrao<Departamento> {

    public PersisteDepartamento(Departamento objeto) {
        super(objeto);
    }
   
    @Override
    String stringInsert() {
        return "INSERT INTO " + nomeTabela()  +
                "VALUES('" + objeto.getId() +
                "','" + objeto.getNome() +
                "')";
    }

    @Override
    String nomeTabela() {
        return "DEPARTAMENTOS";
    }
    
}
