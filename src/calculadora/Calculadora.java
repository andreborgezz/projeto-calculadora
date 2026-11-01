package calculadora;

/**
 * Projeto Calculadora - FinancApp
 *
 * essa classe fornece operacoes matematicas basicas como soma, subtracao,
 * multiplicacao e divisao, alem de um metodo principal que seleciona a operacao
 * com base no operador informado.
 *
 * @author andreborgezz
 * @version 2.0
 */
public class Calculadora {

    /**
     * soma dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * subtrai b de a.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtracao de a menos b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * multiplica dois numeros inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * divide a por b. lanca excecao se b for zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return o quociente inteiro de a dividido por b
     * @throws IllegalArgumentException se b for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao e permitida.");
        }
        return a / b;
    }

    /**
     * executa a operacao matematica com base no operador informado.
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador simbolo da operacao desejada
     * @return o resultado da operacao correspondente ao operador informado
     * @throws IllegalArgumentException se o operador nao for valido
     */
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
