package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class AlteracaoCargo extends ManipulacaoBdPadrao<Cargo> {
    public AlteracaoCargo(Cargo objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "UPDATE CARGOS\n"
                + "SET NOME = '" + objeto.getNome() + "'\n"
                + "SET SALARIO = '" + objeto.getSalario() + "'\n"
                + "WHERE ID_CARGO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "CARGOS";
    }
}
