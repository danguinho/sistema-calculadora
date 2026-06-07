import java.util.Scanner;

public class Calculadora {


    Scanner sc = new Scanner(System.in);
    boolean sistemaAtivo = false;


    public int iniciarSistema() {
        System.out.println("-----CALCULADORA------");
        System.out.println("Selecione a operação que deseja" +
                " realizar:");
        System.out.println("|1| Soma.\n" +
                "|2| Subtração.\n" +
                "|3| Multiplicação.\n" +
                "|4| Divisão\n");

        int escolha = sc.nextInt();
        return escolha;
    }


    public double calcular(OperacaoEnum op, double a, double b) {
        switch (op) {
            case SOMA: return a + b;
            case SUBTRACAO: return a - b;
            case MULTIPLICACAO: return a * b;
            case DIVISAO: return a / b;
        }
        return 0;
    }


    public void continuar(){
        System.out.println("Deseja Continuar? (y|n)");
        char resp = sc.next().charAt(0);
        if (resp == 'n') {
            sistemaAtivo = false;
        } else {
            System.out.println("\nRetornando ao Menu de Escolhas...\n");
            iniciarSistema();
            sistemaAtivo = true;
        }

    }




}
