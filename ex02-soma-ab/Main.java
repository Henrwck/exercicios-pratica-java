import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números:");
    System.out.printf("O resultado é: %d", Calculadora.calculoNumero(sc.nextInt(), sc.nextInt()));
}

static class Calculadora {
    static int calculoNumero(int A, int B){
        int C;

        if (A == B){
            C = A+B;
        } else {
            C = A*B;
        }

        return C;
    }
}