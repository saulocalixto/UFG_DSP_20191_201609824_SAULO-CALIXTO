/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.aula2528jpa.repositorio;

import com.github.saulocalixto.aula2528jpa.model.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alunoinf_2
 */
public class RepositorioVeiculoImpl implements RepositorioVeiculo {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.github.saulocalixto.aula2528jpa");
    private EntityManager em;
    
    public RepositorioVeiculoImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public void criar(Veiculo objeto) {
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
    }

    @Override
    public Veiculo consulte(Long id) {
       //em.getTransaction().begin();
        Veiculo veiculo = em.find(Veiculo.class, id);
        //em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public void atualize(Veiculo objeto) {
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
    }

    @Override
    public void apague(Veiculo objeto) {
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
    }
    
    public void close() {
        emf.close();
    }
    
}
