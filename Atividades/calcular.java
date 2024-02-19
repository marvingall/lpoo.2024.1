
import java.util.Scanner;
public class Calcular
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println( "digite o primeiro digito");
    int numero1 = scanner.nextInt();
    System.out.println(" digite o segundo digito");
    int numero2 = scanner.nextInt();
    
    int soma = numero1 + numero2;
    int div = numero1 / numero2;
    int multi = numero1 * numero2;
    
    System.out.println( " O que voce quer fazer com esse numeros: 1.Soma 2.Div 3.Multi 4.lixo");
    int opcao = scanner.nextInt();
    
    switch(opcao){
        case 1:
            System.out.println("Voce somou e o resultado e:" + soma );
            break;
        case 2:
            System.out.println("voce dividiu e o resultado e:" + div);
            break;
        case 3: 
            System.out.println("voce multiplicou e o resultado e:" + div);
            break;
        case 4:
            break;
            }
        scanner.close();
    }
}
