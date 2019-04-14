package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaFuncionarios;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao.AlteracaoFuncionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsulteFuncionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete.DeleteFuncionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteFuncionario;

public class ServicoFuncionario extends ServicoPadrao<Funcionario> {

    @Override
    protected CriadorDeTabela retorneCriadorDaTabela() {
        return new CriadorDeTabelaFuncionarios();
    }

    @Override
    protected ManipulacaoBdPadrao<Funcionario> retorneInserir(Funcionario objeto) {
        return new PersisteFuncionario(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Funcionario> retorneAtualizar(Funcionario objeto) {
        return new AlteracaoFuncionario(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Funcionario> retorneDeletar(Funcionario objeto) {
        return new DeleteFuncionario(objeto);
    }

    @Override
    protected ConsultePadrao<Funcionario> retorneConsultar() {
        return new ConsulteFuncionario();
    }
}
