package br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.view;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico.*;
import br.com.saulocalixto.dsp20191.utilitario.UtilitarioDeData;
import br.com.saulocalixto.dsp20191.view.MenuPadrao;

import java.util.Date;
import java.util.List;

public class GestaoDeFuncionariosView extends MenuPadrao {

    private ServicoPadrao<Funcionario> servicoFuncionario;
    private ServicoPadrao<Cargo> servicoCargo;
    private ServicoPadrao<Departamento> servicoDepartamento;
    private ServicoPadrao<Lotacao> servicoLotacao;

    private Funcionario funcionario;
    private Departamento departamento;
    private Cargo cargo;
    private Lotacao lotacao;

    public GestaoDeFuncionariosView() {
        servicoFuncionario = new ServicoFuncionario();
        servicoCargo = new ServicoCargo();
        servicoDepartamento = new ServicoDepartamento();
        servicoLotacao = new ServicoLotacao();

        funcionario = new Funcionario();
        cargo = new Cargo();
        departamento = new Departamento();
        lotacao = new Lotacao();
    }

    public void acoesMenu() {

        int escolha = -1;

        while (escolha != 0) {
            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Cadastrar cargo");
            System.out.println("3 - Cadastrar departamento");
            System.out.println("4 - Cadastrar lotação");
            System.out.println("5 - Consultar funcionário");
            System.out.println("6 - Consultar cargo");
            System.out.println("7 - Consultar departamento");
            System.out.println("8 - Consultar lotação");
            System.out.println("9 - Apagar Lotação");
            System.out.println("10 - Alterar salário");
            System.out.println("0 - Sair");

            escolha = leitor().nextInt();
            leitor().nextLine();

            acoesMenu(escolha);
        }
    }

    public void acoesMenu(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Digite o id do funcionário: ");
                funcionario.setId(leitor().nextLong());
                leitor().nextLine();
                System.out.printf("Digite o nome do funcionário: ");
                funcionario.setNome(leitor().nextLine());
                System.out.println("Digite a matrícula do funcionário: ");
                funcionario.setMatricula(leitor().nextLong());
                leitor().nextLine();
                servicoFuncionario.insere(funcionario);
                break;
            case 2:
                System.out.println("Digite o id do cargo: ");
                cargo.setId(leitor().nextLong());
                System.out.println("Digite o nome do cargo: ");
                leitor().nextLine();
                cargo.setNome(leitor().nextLine());
                System.out.println("Digite o salário do cargo: ");
                cargo.setSalario(leitor().nextDouble());
                servicoCargo.insere(cargo);
                break;
            case 3:
                System.out.println("Digite o id do departamento: ");
                departamento.setId(leitor().nextLong());
                leitor().nextLine();
                System.out.println("Digite o nome do departamento: ");
                departamento.setNome(leitor().nextLine());
                servicoDepartamento.insere(departamento);
                break;
            case 4:
                System.out.println("Digite o id da lotação: ");
                lotacao.setId(leitor().nextLong());
                leitor().nextLine();
                System.out.println("Digite a data inicial dd/MM/yyyy: ");
                String dataInicialString = leitor().nextLine();

                Date dataInicial = UtilitarioDeData.parseStringToDate(dataInicialString, "dd/mm/yyyy");
                System.out.println("Digite a data final dd/MM/yyyy: ");
                String dataFinalString = leitor().nextLine();
                Date dataFinal = UtilitarioDeData.parseStringToDate(dataFinalString,"dd/mm/yyyy");
                lotacao.setDataInicial(dataInicial);
                lotacao.setDataFinal(dataFinal);
                System.out.println("Digite o id do funcionário: ");
                funcionario.setId(leitor().nextLong());
                leitor().nextLine();
                System.out.println("Digite o id do cargo: ");
                cargo.setId(leitor().nextLong());
                leitor().nextLine();
                System.out.println("Digite o id do departamento: ");
                departamento.setId(leitor().nextLong());
                leitor().nextLine();
                lotacao.setFuncionario(funcionario);
                lotacao.setCargo(cargo);
                lotacao.setDepartamento(departamento);
                servicoLotacao.insere(lotacao);
                break;
            case 5:
                System.out.println("Digite o id do funcionário a ser consultado;");
                funcionario = servicoFuncionario.consulte(leitor().nextLong());
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Matrícula: " + funcionario.getMatricula());
                leitor().nextLine();
                break;
            case 6:
                System.out.println("Digite o id do cargo a ser consultado;");
                cargo = servicoCargo.consulte(leitor().nextLong());
                System.out.println("Nome: " + cargo.getNome());
                System.out.println("Salário: " + cargo.getSalario());
                leitor().nextLine();
                break;
            case 7:
                System.out.println("Digite o id do departamento a ser consultado;");
                departamento = servicoDepartamento.consulte(leitor().nextLong());
                System.out.println("Nome: " + departamento.getNome());
                leitor().nextLine();
                break;
            case 8:
                System.out.println("Digite o id da lotação a ser consultada;");
                lotacao = servicoLotacao.consulte(leitor().nextLong());
                if(lotacao != null) {
                    System.out.println("Data inicial: " + UtilitarioDeData.parseDataToString(lotacao.getDataInicial(), "dd/MM/yyyy"));
                    System.out.println("Data final: " + UtilitarioDeData.parseDataToString(lotacao.getDataFinal(), "dd/MM/yyyy"));
                    System.out.println("Funcionário: " + lotacao.getFuncionario().getNome());
                    System.out.println("Departamento: " + lotacao.getDepartamento().getNome());
                    System.out.println("Cargo: " + lotacao.getCargo().getNome());
                } else {
                    System.out.println("Lotação não encontrada.");
                }
                leitor().nextLine();
                break;
            case 9:
                System.out.println("Digite o id da lotação a ser apagada;");
                lotacao.setId(leitor().nextLong());
                servicoLotacao.delete(lotacao);

                leitor().nextLine();
                break;
            case 10:
                System.out.println("Digite o id do cargo a ser consultado;");
                long idCargo = leitor().nextLong();
                System.out.println("Digite o id do departamento a ser consultado;");
                long idDepartamento = leitor().nextLong();
                List<Lotacao> lotacoes = ((ServicoLotacao)servicoLotacao).consultePorCargoEDepartamento(idCargo, idDepartamento);
                if(lotacao != null) {
                    System.out.println("Digite o novo salário: ");
                    double novoSalario = leitor().nextDouble();
                    lotacoes.stream().forEach(x -> {
                        x.getCargo().setSalario(novoSalario);
                        servicoCargo.altere(x.getCargo());
                        System.out.println("Salario do funcionário " + x.getFuncionario().getNome() + " alterado.");
                    });
                } else {
                    System.err.println("Funcionário não encontrado para essa lotação.");
                }
                break;
        }
    }
}
