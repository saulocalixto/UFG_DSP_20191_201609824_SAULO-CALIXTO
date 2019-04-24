/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.aula2528jpa.repositorio;

import com.github.saulocalixto.aula2528jpa.model.Veiculo;

/**
 *
 * @author Alunoinf_2
 */
public interface RepositorioVeiculo {
    void criar(Veiculo objeto);
    Veiculo consulte(Long id);
    void atualize(Veiculo objeto);
    void apague(Veiculo objeto);
    void close();
}
