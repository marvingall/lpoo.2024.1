import java.util.Scanner;

public class GeometriaMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        double largura = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a profundidade: ");
        double profundidade = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o comprimento: ");
        double comprimento = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite qual operação você quer fazer: 1-Perimetro 2-Area 3-Volume");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O perimetro é: " + calcularPerimetro(comprimento, largura));
                break;
            case 2:
                System.out.println("A area e: " + calcularArea(comprimento, largura));
                break;
            case 3:
                System.out.println("O volume e: " + calcularVolume(comprimento, largura, profundidade));
                break;
            default:
                System.out.println("Opçao invalida");
        }

        scanner.close();
    }

    public static double calcularPerimetro(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }

    public static double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double calcularVolume(double comprimento, double largura, double profundidade) {
        return comprimento * largura * profundidade;
    }
}
