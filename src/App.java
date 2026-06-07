
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean sistemaAtivo = false;

        Calculadora calc = new Calculadora();


        do {

            calc.iniciarSistema();
            double a = sc.nextDouble();
            Operacao operacao = Operacao.converterSinal(sc.next());
            double b = sc.nextDouble();
            double resultado = calc.calcular(a, operacao, b);
            System.out.printf("Resultado: %.2f\n",resultado);
            sistemaAtivo = calc.continuar();


        } while (!sistemaAtivo);

    }
}