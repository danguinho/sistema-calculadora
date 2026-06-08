import java.util.Scanner;

public class Calculadora {


    Scanner sc = new Scanner(System.in);

    public void iniciarSistema() {
        System.out.println();
        System.out.println("-----CALCULADORA------");
        System.out.println("Bem Vindo!");
        System.out.println("Digite uma expressão de soma, subtração, multiplicação ou divisão: ");
        System.out.println("Não esqueça do espaço entre os operadores e os números na equação.");
    }


    public double calcular(double a, Operacao op, double b) {
        switch (op) {
            case SOMA:
                return a + b;
            case SUBTRACAO:
                return a - b;
            case MULTIPLICACAO:
                return a * b;
            case DIVISAO:
                return a / b;
            case IGUAL:
                break;
        }
        return 0;
    }


    public boolean continuar() {
        System.out.println("Deseja Continuar? (y|n)");
        char resp = sc.next().charAt(0);
        if (resp == 'n') {
            System.out.println("\nFechando Programa!\n");
            return true;
        } else {
            System.out.println("\nRetornando ao Menu de Escolhas...\n");
            return false;
        }

    }






}
