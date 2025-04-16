package fase06.L6Exercicio04.dominio;

public class Aluno {
    private String nome;
    private double nota;
    

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int validarNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            return 1;
        } else {
            return 0;
        }
    }

    public String classificarAluno(double nota) {
        if(nota >= 7) {
            return "Aprovado";
        } else {
            if(nota >= 5) {
                return "Recuperação";
            } else {
                return "Reprovado";
            }
        }
    }
}    
