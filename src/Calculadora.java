import java.util.Scanner;

public class Calculadora {


    Scanner sc = new Scanner(System.in);

    public void iniciarSistema() {
        System.out.println();
        System.out.println("-----CALCULADORA------");
        System.out.println("Bem Vindo!");
        System.out.println("Digite uma expressão de soma, subtração, multiplicação ou divisão: ");

        boolean sistemaAtivo = false;
        Operacao op;

        /// Entrada do usuário:
        String entrada = sc.nextLine();
        String[] partes = entrada.split("(?<=[-+*/])|(?=[-+*/])");

        /// Imprimindo a expressão:
        for (String p : partes) {
            System.out.print("(" + p + ")");
        }

        /// Convertendo os valores tipo String em operador e número decimal.
        /// calculando o resultado da expressão e depois imprimindo o resultado
        double n1 = Double.parseDouble(partes[0]);
        op = Operacao.converterSinal(partes[1]);
        double n2 = Double.parseDouble(partes[2]);
        double resultado = calcular(n1, op, n2);
        System.out.printf(" %.2f ", resultado);

        /// Iniciando o loop do calculo:
        do {
            entrada = sc.nextLine();
            partes = entrada.split("(?<=[-+*/])|(?=[-+*/])");

            if (entrada.equalsIgnoreCase("sair")) {
                sistemaAtivo = true;
            } else {
                op = Operacao.converterSinal(partes[0]);
                n2 = Double.parseDouble(partes[1]);
                resultado = calcular(resultado, op, n2);
                System.out.printf(" %.2f ", resultado);
            }

        } while (!sistemaAtivo);


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


    public void fecharSistema() {
        System.out.println("Fechando Calculadora...");
    }


}
