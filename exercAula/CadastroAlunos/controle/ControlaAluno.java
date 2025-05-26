package exercAula.CadastroAlunos.controle;

import exercAula.CadastroAlunos.dominio.*;
import java.io.*;
import java.util.Scanner;
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
        System.out.println("O aluno foi adicionado com sucesso!");
    }

    public void listarAlunos(int matricula, String nome, double coeficienteRendimento) {
        if(alunos.isEmpty()) {
            System.out.println("Não existem alunos cadastrados no sistema!");
        } else {
            System.out.println("Alunos cadastrados: ");
            for (Aluno aluno : alunos) {
                aluno.mostrarInfos();
            }
        }
    }
}
