import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número:");
    Calculadora.numerosProximos(sc.nextInt());
}

static class Calculadora {
    static void numerosProximos(int num){
        System.out.printf("Número %d \nAntecessor: %d \nSucessor: %d", num, num-1, num+1);
    }
}