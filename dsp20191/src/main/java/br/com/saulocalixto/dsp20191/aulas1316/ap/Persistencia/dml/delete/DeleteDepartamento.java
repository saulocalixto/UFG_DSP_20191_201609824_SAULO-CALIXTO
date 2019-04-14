package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class DeleteDepartamento extends ManipulacaoBdPadrao<Departamento> {
    public DeleteDepartamento(Departamento objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "DELETE FROM " + nomeTabela() + " WHERE ID_DEPARTAMENTO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "DEPARTAMENTOS";
    }
}
