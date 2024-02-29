import java.util.Scanner;

public class Atleta{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        maioridade(idade, nome);
        
    }
    public static void maioridade(int idade, String nome ){
        if (idade >= 18){
            System.out.println(nome + " voce e maior de idade");
       } else {
            System.out.println(nome + " voce e menor de idade");
        }
        }
    
}