
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean sistemaAtivo = false;

        Calculadora calc = new Calculadora();

        double valora, valorb;


        do {

            int entradaUsuario = calc.iniciarSistema();
            OperacaoEnum op = OperacaoEnum.traduzCodigo(entradaUsuario);


            switch (op) {
                case SOMA:
                    System.out.println("Digite os valores de soma: ");
                    System.out.print("Primeiro valor: ");
                    valora = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valorb = sc.nextDouble();
                    calc.calcular(op, valora, valorb);
                    System.out.println();
                    calc.continuar();

                case SUBTRACAO:
                    System.out.println("Digite os valores de soma: ");
                    System.out.print("Primeiro valor: ");
                    valora = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valorb = sc.nextDouble();
                    calc.calcular(op, valora, valorb);
                    System.out.println();
                    calc.continuar();

                case MULTIPLICACAO:
                    System.out.println("Digite os valores de soma: ");
                    System.out.print("Primeiro valor: ");
                    valora = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valorb = sc.nextDouble();
                    calc.calcular(op, valora, valorb);
                    System.out.println();
                    calc.continuar();

                case DIVISAO:
                    System.out.println("Digite os valores de soma: ");
                    System.out.print("Primeiro valor: ");
                    valora = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valorb = sc.nextDouble();
                    calc.calcular(op, valora, valorb);
                    System.out.println();
                    calc.continuar();
            }

        } while (!sistemaAtivo);

    }
}