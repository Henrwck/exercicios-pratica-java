import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite três números:");
    Calculadora.ordenarNumeros(sc.nextInt(), sc.nextInt(), sc.nextInt());

    sc.close();
}

static class Calculadora{
    static void ordenarNumeros(Integer... numeros){
        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println(Arrays.toString(numeros));
    }
}