import java.util.Scanner;

public class Calculadora implements Operacoes{


    Scanner sc = new Scanner(System.in);

    @Override
    public int iniciarSistema() {
        System.out.println("-----CALCULADORA------");
        System.out.println("Selecione a operação que deseja" +
                " realizar:");
        System.out.println("|1| Soma.\n" +
                "|2| Subtração.\n" +
                "|3| Multiplicação.\n" +
                "|4| Divisão\n");

        int escolhaUsuario = sc.nextInt();
        return escolhaUsuario;
    }

    @Override
    public void somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        System.out.printf("Total: %.2f\n", soma);
    }

    @Override
    public void subtrair(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        System.out.printf("Total: %.2f\n", subtracao);
    }


     @Override
     public void multiplicar(double valor1, double valor2){
        double multiplicacao = valor1*valor2;
         System.out.printf("Total: %.2f\n", multiplicacao);
     }


    @Override
    public void dividir(double numerador, double denominador) {
        double divisao = numerador/denominador;
        System.out.printf("Total: %.2f\n", divisao);

    }


}
