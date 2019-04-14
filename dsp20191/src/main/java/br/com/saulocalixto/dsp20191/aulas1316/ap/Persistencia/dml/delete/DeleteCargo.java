package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class DeleteCargo extends ManipulacaoBdPadrao<Cargo> {
    public DeleteCargo(Cargo objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "DELETE FROM " + nomeTabela() + " WHERE ID_CARGO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "CARGOS";
    }
}
