import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número:");
    Calculadora.analisarNumero(sc.nextInt());

    sc.close();
}

static class Calculadora {
    static void analisarNumero(int num){
        System.out.printf("O número %d é %s e %s!", num,
                (num == 0) ? "zero" : (num > 0) ? "positivo" : "negativo",
                ((num % 2) == 0) ? "par" : "ímpar");
    }
}