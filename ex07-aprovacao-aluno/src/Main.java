import java.util.Scanner;

void main() {
    Calculadora.historicoEscolar();
}

static class Calculadora {
    static Scanner sc = new Scanner(System.in);

    static double calculoNotas(double n1, double n2, double n3, double n4){
        return (n1+n2+n3+n4) / 4;
    }

    static void historicoEscolar(){
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite suas notas: (ex: 8,5)");
        double media = calculoNotas(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("Aluno: %s \nMédia: %.2f \nStatus: %s",
                nome, media, media >= 7.0 ? "Aprovado" : "Reprovado");
    }
}