import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero qualquer: ");
        double number = Double.parseDouble(scanner.nextLine());
        oDobro(number);
    }
    public static void oDobro(double number){
        double resultado = number * 2;
        System.out.println("o dobro do numero e: " + resultado);
    }
}