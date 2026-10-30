import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as três notas (ex: 8,5)");
    System.out.printf("Sua média é %.2f!", Calculadora.calculoNotas(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
}

static class Calculadora {
    static double calculoNotas(double n1, double n2, double n3){
        return (n1+n2+n3) / 3;
    }
}