class Aluno {
    private int matricula;
    private String nome;

   

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Métodos getter e setter
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método verificarMatricula
    public void verificarMatricula() {
        if (matricula > 0) {
            System.out.println("Matrícula válida.");
        } else {
            System.out.println("Matrícula inválida.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Aluno
        Aluno aluno1 = new Aluno(12345, "João");
        Aluno aluno2 = new Aluno(54321, "Maria");

        // Testando método verificarMatricula
        aluno1.verificarMatricula();
        aluno2.verificarMatricula();

        // Exibindo informações utilizando o método toString
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
