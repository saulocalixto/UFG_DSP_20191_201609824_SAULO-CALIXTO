package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;

public abstract class ServicoPadrao<T> {
    private ManipulacaoBdPadrao<T> manipuleBd;
    private CriadorDeTabela criadorTabela;
    private ConsultePadrao<T> consulteConceito;

    public ServicoPadrao() {
        criadorTabela = retorneCriadorDaTabela();
        criadorTabela.criaTabela();
    }

    /**
     * Insere um objeto no banco.
     * @param objeto Objeto a ser inserido.
     */
    public void insere(T objeto) {
        manipuleBd = retorneInserir(objeto);
        manipuleBd.execute();
    }

    /**
     * Altera no banco qualquer campo do objeto.
     * @param objeto Objeto a ser alterado.
     */
    public void altere(T objeto) {
        manipuleBd = retorneAtualizar(objeto);
        manipuleBd.execute();
    }

    /**
     * Deleta o objeto do banco.
     * @param objeto Objeto a ser removido do banco.
     */
    public void delete(T objeto) {
        manipuleBd = retorneDeletar(objeto);
        manipuleBd.execute();
    }

    /**
     * Consulta um objeto no banco.
     * @param id Id do objeto a ser consultado do banco.
     */
    public T consulte(long id) {
        consulteConceito = retorneConsultar();
        return consulteConceito.consultaPorId(id);
    }

    protected abstract CriadorDeTabela retorneCriadorDaTabela();
    protected abstract ManipulacaoBdPadrao<T> retorneInserir(T objeto);
    protected abstract ManipulacaoBdPadrao<T> retorneAtualizar(T objeto);
    protected abstract ManipulacaoBdPadrao<T> retorneDeletar(T objeto);
    protected abstract ConsultePadrao<T> retorneConsultar();
}
