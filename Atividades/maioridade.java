import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        maioridade(nome, idade);
    }

    public static void maioridade(String nome, int idade) {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade");
        } else {
            System.out.println(nome + " é maior de idade");
        }
    }
}
