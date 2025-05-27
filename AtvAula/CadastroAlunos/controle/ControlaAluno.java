package AtvAula.CadastroAlunos.controle;

import java.io.*;
import java.util.Scanner;
import AtvAula.CadastroAlunos.dominio.*;
import java.util.ArrayList;


public class ControlaAluno {
    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    public ControlaAluno() {
        this.alunos = new ArrayList<>();
        carregarProdutos();
    }

    public void adicionarAluno(int matricula, String nome, double coeficienteRendimento) {
        Aluno aluno = new Aluno(matricula, nome, coeficienteRendimento);
        alunos.add(aluno);
        salvarAlunos();
        System.out.println("\nO aluno foi adicionado com sucesso!");
    }

    public void listarAlunos() {
        if(alunos.isEmpty()) {
            System.out.println("\nNão existem alunos cadastrados no sistema!");
        } else {
            System.out.println("\nAlunos cadastrados: ");
            for (Aluno aluno : alunos) {
                aluno.mostrarInfos();
            }
        }
    }

    public void alterarAlunos(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);

        if(aluno != null) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nNovo nome: ");
            String novoNome = entrada.nextLine();
            System.out.println("Novo CR: ");
            double novoCR = entrada.nextDouble();
            entrada.close();

            aluno.setNome(novoNome);
            aluno.setCoeficienteRendimento(novoCR);

            salvarAlunos();
            System.out.println("\nOs dados do aluno foram alterados!");
        } else {
            System.out.println("\nO aluno com a matrícula informada não foi encontrado!");
        }
    }

    public void excluirAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);

        if(aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            System.out.println("\nAluno excluído com sucesso!");
        } else {
            System.out.println("\nA matrícula informada não foi encontrada!");
        }
    }

    private Aluno buscarAlunoPorMatricula(int matricula) {
        for(Aluno aluno : alunos) {
            if(aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for(Aluno aluno : alunos) {
                writer.write(aluno.getMatricula() + ";" + aluno.getNome() + ";" + aluno.getCoeficienteRendimento());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("\nErro ao salvar dados do aluno: " + e.getMessage());
        }
    }

    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int matricula = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double coeficienteRendimento = Double.parseDouble(dados[2]);
                alunos.add(new Aluno(matricula, nome, coeficienteRendimento));
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nArquivo não encontrado. Será criado ao registrar novos dados de alunos");
        } catch (IOException e) {
            System.out.println("\nErro ao carregar dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ControlaAluno controle = new ControlaAluno();
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-------Menu-------");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar aluno");
            System.out.println("3. Alterar aluno");
            System.out.println("4. Excluir aluno");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("------------");
                    System.out.print("Matrícula do aluno: ");
                    int matricula = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome do aluno: ");
                    String nome = entrada.nextLine();

                    System.out.print("Insira o coeficiente de rendimendo: ");
                    double coeficienteRendimento = entrada.nextDouble();

                    controle.adicionarAluno(matricula, nome, coeficienteRendimento);
                    break;

                case 2:
                    System.out.println("------------");
                    controle.listarAlunos();
                    break;
                    
                case 3:
                    System.out.println("------------");
                    System.out.println("Informe a matrícula do aluno que será alterado: ");
                    int matriculaAlterar = entrada.nextInt();
                    entrada.close();
                    controle.alterarAlunos(matriculaAlterar);

                case 4:
                    System.out.println("------------");
                    System.out.print("Informe a matrícula do aluno que será excluído: ");
                    int matriculaExcluir = entrada.nextInt();
                    controle.excluirAluno(matriculaExcluir);
                    break;

                case 0: 
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("------------");
                    System.out.println("Por favor, escolha uma opção válida!");    
            }
        } while (opcao != 0);

        entrada.close();
    }
}
