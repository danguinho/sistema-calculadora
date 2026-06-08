
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean sistemaAtivo = false;

        Calculadora calc = new Calculadora();

        double valora = 0;
        double valorb = 0;


        do {

            calc.iniciarSistema();

            valora = sc.nextDouble();
            Operacao op = Operacao.converterSinal(sc.next());
            valorb = sc.nextDouble();
            double resultado = calc.calcular(valora,op,valorb);

            while(true){
                String entrada = sc.next();
                if(entrada.equals("=")){
                    System.out.println(resultado);
                    break;
                } else{
                    op = Operacao.converterSinal(entrada);
                    valorb = sc.nextDouble();
                    resultado = calc.calcular(resultado, op, valorb);
                }
            }

            sistemaAtivo = calc.continuar();

        } while (!sistemaAtivo);

    }
}