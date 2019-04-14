package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaLotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao.AlteracaoLotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsulteLotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete.DeleteLotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteLotacao;

public class ServicoLotacao extends ServicoPadrao<Lotacao> {
    @Override
    protected CriadorDeTabela retorneCriadorDaTabela() {
        return new CriadorDeTabelaLotacao();
    }

    @Override
    protected ManipulacaoBdPadrao<Lotacao> retorneInserir(Lotacao objeto) {
        return new PersisteLotacao(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Lotacao> retorneAtualizar(Lotacao objeto) {
        return new AlteracaoLotacao(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Lotacao> retorneDeletar(Lotacao objeto) {
        return new DeleteLotacao(objeto);
    }

    @Override
    protected ConsultePadrao<Lotacao> retorneConsultar() {
        return new ConsulteLotacao();
    }
}
