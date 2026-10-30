void main() {
    Calculadora.analisarNumero(67);
}

abstract class Calculadora {
    static void analisarNumero(int num){
        System.out.printf("O número %d é %s e %s!", num,
                (num == 0) ? "zero" : (num > 0) ? "positivo" : "negativo",
                ((num % 2) == 0) ? "par" : "ímpar");
    }
}