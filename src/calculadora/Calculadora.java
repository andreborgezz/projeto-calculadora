package calculadora;

public class Calculadora {

    // soma dois numeros inteiros e retorna o resultado
    public int somar(int a, int b) {
        return a + b;
    }

    // subtrai b de a e retorna o resultado
    public int subtrair(int a, int b) {
        return a - b;
    }

    // multiplica dois numeros inteiros e retorna o resultado
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // divide a por b, lanca excecao se b for zero
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao e permitida.");
        }
        return a / b;
    }

    // seleciona e executa a operacao com base no operador informado
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador invalido: " + operador);
        };
    }
}
