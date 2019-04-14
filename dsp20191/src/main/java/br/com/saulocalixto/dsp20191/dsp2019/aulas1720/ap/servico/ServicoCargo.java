package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaCargos;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao.AlteracaoCargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsulteCargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete.DeleteCargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteCargo;

public class ServicoCargo extends ServicoPadrao<Cargo> {
    @Override
    protected CriadorDeTabela retorneCriadorDaTabela() {
        return new CriadorDeTabelaCargos();
    }

    @Override
    protected ManipulacaoBdPadrao<Cargo> retorneInserir(Cargo objeto) {
        return new PersisteCargo(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Cargo> retorneAtualizar(Cargo objeto) {
        return new AlteracaoCargo(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Cargo> retorneDeletar(Cargo objeto) {
        return new DeleteCargo(objeto);
    }

    @Override
    protected ConsultePadrao<Cargo> retorneConsultar() {
        return new ConsulteCargo();
    }
}
