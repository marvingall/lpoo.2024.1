import java.util.Scanner;

public class Salario{
    public static void main(String[]args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite o salario do funcionario: ");
    double valor = scanner.nextDouble();
    System.out.println("O aumento devera ser de: 1-dez por cento 2-vinte por cento");
    int opcao = scanner.nextInt();
    
    switch(opcao){
        case 1: 
            System.out.println(" O aumento foi de dez por cento: "   + aumentarDez(valor));
            break;
        case 2:
            System.out.println(" O aumento foi de vinte por cento:  "  + aumentarVinte(valor));
            break;
        default: 
            System.out.println("Digito incorreto.");
    }
    }
    public static double aumentarDez(double valor){
       return valor * 1.10;
    }
    public static double aumentarVinte(double valor){
       return valor * 1.20;
    }
}