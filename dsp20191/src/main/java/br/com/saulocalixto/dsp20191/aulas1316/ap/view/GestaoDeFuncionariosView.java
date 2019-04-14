package br.com.saulocalixto.dsp20191.aulas1316.ap.view;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.dsp2019.aulas1720.ap.servico.*;
import br.com.saulocalixto.dsp20191.view.MenuPadrao;

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
        }
    }
}
