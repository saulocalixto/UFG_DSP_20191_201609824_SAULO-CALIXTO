package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class DeleteLotacao extends ManipulacaoBdPadrao<Lotacao> {
    public DeleteLotacao(Lotacao objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "DELETE FROM " + nomeTabela() + " WHERE ID_LOTACOES = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "LOTACOES";
    }
}
