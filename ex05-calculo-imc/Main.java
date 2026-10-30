import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua altura: (ex: 1,80)");
    double alt = sc.nextDouble();
    System.out.println("Digite seu peso:");
    double kg = sc.nextDouble();
    Calculadora.calculoIMC(alt, kg);
}

static class Calculadora {
    static void calculoIMC(double altura, double peso){
        double IMC = peso / (altura*altura);
        String textoPeso =
                (IMC < 18.5) ? "Abaixo do peso" :
                (IMC > 18.6 && IMC < 24.9) ? "Peso ideal" :
                (IMC > 25 && IMC < 29.9) ? "Acima do peso" :
                (IMC > 30 && IMC < 34.9) ? "Obesidade I" :
                (IMC > 35 && IMC < 39.9) ? "Obesidade II" : "Obesidade III";

        System.out.printf("Seu IMC é %.2f. %s.", IMC, textoPeso);
    }
}