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


}
