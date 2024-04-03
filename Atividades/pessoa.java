public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

  
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public static void main(String[] args) {
    
        Pessoa pessoa = new Pessoa("João", 30, "Engenheiro");

       
        System.out.println(pessoa.toString());
    }
}
