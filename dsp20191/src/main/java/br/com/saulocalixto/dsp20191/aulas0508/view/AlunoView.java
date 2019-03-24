package br.com.saulocalixto.dsp20191.aulas0508.view;

import br.com.saulocalixto.dsp20191.aulas0104.ap.utilitario.LeitorDeArquivo;
import br.com.saulocalixto.dsp20191.aulas0508.model.Aluno;
import br.com.saulocalixto.dsp20191.aulas0508.utilitario.GeradorDeArquivoDat;
import br.com.saulocalixto.dsp20191.utilitario.GeradorDeArquivoPadrao;
import br.com.saulocalixto.dsp20191.view.MenuPadrao;

import java.util.InputMismatchException;

public class AlunoView extends MenuPadrao {

    private Aluno aluno;

    public void acoesMenu() {

        int escolha = -1;

        while (escolha != 0) {
            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Salvar aluno");
            System.out.println("2 - Imprimir todos alunos");
            System.out.println("0 - Sair");

            escolha = leitor().nextInt();
            leitor().nextLine();

            acoesMenu(escolha);
        }
    }

    public void acoesMenu(int escolha) {
        switch (escolha) {
            case 1:
                salvarAluno();
                break;
            case 2:
                imprimirAlunos();
                break;
        }
    }

    private void imprimirAlunos() {
        informeCaminhoArquivo();
        LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo(caminhoCompleto);
        leitorDeArquivo.imprimeConteudoNoConsole();
    }

    private void salvarAluno() {
        pegueInformacoesArquivo();
        preenchaDadosDeAluno();
        GeradorDeArquivoPadrao gerador = new GeradorDeArquivoDat(caminhoArquivo, nomeArquivo);
        ((GeradorDeArquivoDat) gerador).crieArquivo(aluno);
    }

    private void preenchaDadosDeAluno() {
        aluno = new Aluno();
        System.out.println("Digite o nome completo do aluno: ");
        String nome = leitor().nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        long matricula = leitor().nextLong();
        System.out.println("Digite as notas do aluno, -1 para parar: ");

        aluno.setNome(nome);
        aluno.setMatricula(matricula);

        preenchaNotas();
    }

    private void preenchaNotas() {
        double nota = 0;

        while(nota != -1) {
            try {
                nota = leitor().nextDouble();
                if(nota != -1) {
                    aluno.setNotas(nota);
                }
            } catch (InputMismatchException e) {
                System.out.println("Foi inserido um caractére inválido, casas decimais são separadas por ','.");
                nota = 0;
                leitor().nextLine();
                System.out.println("Digite as notas do aluno, -1 para parar: ");
            }
        }
    }
}
