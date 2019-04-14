package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabela;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.CriadorDeTabelaDepartamentos;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao.AlteraDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsulteDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte.ConsultePadrao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete.DeleteDepartamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteDepartamento;

public class ServicoDepartamento extends ServicoPadrao<Departamento> {
    @Override
    protected CriadorDeTabela retorneCriadorDaTabela() {
        return new CriadorDeTabelaDepartamentos();
    }

    @Override
    protected ManipulacaoBdPadrao<Departamento> retorneInserir(Departamento objeto) {
        return new PersisteDepartamento(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Departamento> retorneAtualizar(Departamento objeto) {
        return new AlteraDepartamento(objeto);
    }

    @Override
    protected ManipulacaoBdPadrao<Departamento> retorneDeletar(Departamento objeto) {
        return new DeleteDepartamento(objeto);
    }

    @Override
    protected ConsultePadrao<Departamento> retorneConsultar() {
        return new ConsulteDepartamento();
    }
}
