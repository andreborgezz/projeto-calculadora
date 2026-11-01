package calculadora;

/**
 * classe de testes da Calculadora refatorada.
 *
 * executa testes manuais dos metodos somar, subtrair, multiplicar, dividir
 * e calcular, incluindo cenarios de erro tratados com try catch.
 *
 * @author andreborgezz
 * @version 2.0
 */
public class TesteCalculadora {

    /**
     * metodo principal que executa todos os testes da calculadora.
     *
     * testa as 4 operacoes basicas e os dois casos de excecao:
     * divisao por zero e operador invalido.
     *
     * @param args argumentos de linha de comando, nao utilizados
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

        try {
            System.out.println(calc.calcular(8, 0, "/")); // excecao esperada: divisao por zero
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // excecao esperada: operador invalido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
