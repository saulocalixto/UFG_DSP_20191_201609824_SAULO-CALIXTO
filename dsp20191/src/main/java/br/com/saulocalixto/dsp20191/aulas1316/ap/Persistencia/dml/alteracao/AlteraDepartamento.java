package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class AlteraDepartamento extends ManipulacaoBdPadrao<Departamento> {
    public AlteraDepartamento(Departamento objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "UPDATE DEPARTAMENTOS\n"
                + "SET NOME = '" + objeto.getNome() + "'\n"
                + "WHERE ID_DEPARTAMENTO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "DEPARTAMENTOS";
    }
}
