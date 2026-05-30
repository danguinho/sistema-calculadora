import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean sistemaAtivo = false;
        int escolhaUsuario;
        double valor1, valor2, numerador, denominador;
        char resp;

        Calculadora calc = new Calculadora();

        do {

            escolhaUsuario = calc.iniciarSistema();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Digite os valores de soma: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valor2 = sc.nextDouble();
                    calc.somar(valor1, valor2);
                    System.out.println("Deseja Continuar? (y|n)");
                    resp = sc.next().charAt(0);
                    if (resp == 'n') {
                        sistemaAtivo = true;
                        break;
                    } else {
                        System.out.println("\nRetornando ao Menu de Escolhas...\n");
                        calc.iniciarSistema();
                    }


                case 2:
                    System.out.println("Digite os valores de subtracao: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Segundo Valor: ");
                    valor2 = sc.nextDouble();
                    calc.subtrair(valor1, valor2);
                    System.out.println("Deseja Continuar? (y|n)");
                    resp = sc.next().charAt(0);
                    if (resp == 'n') {
                        System.out.println("Saindo do sistema...");
                        sistemaAtivo = true;
                        break;
                    } else {
                        System.out.println("\nRetornando ao Menu de Escolhas...\n");
                        calc.iniciarSistema();
                    }


                case 3:
                    System.out.println("Digite os valores de Multiplicação: ");
                    System.out.print("Primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Segundo valor: ");
                    valor2 = sc.nextDouble();
                    calc.multiplicar(valor1, valor2);
                    System.out.println("Deseja Continuar? (y|n)");
                    resp = sc.next().charAt(0);
                    if (resp == 'n') {
                        System.out.println("Saindo do sistema...");
                        sistemaAtivo = true;
                        break;
                    } else {
                        System.out.println("\nRetornando ao Menu de Escolhas...\n");
                        calc.iniciarSistema();
                    }


                case 4:

                    System.out.println("Digite os valores de Divisão: ");
                    System.out.print("Numerador: ");
                    numerador = sc.nextDouble();
                    System.out.print("Denominador: ");
                    denominador = sc.nextDouble();
                    calc.dividir(numerador, denominador);
                    System.out.println("Deseja Continuar? (y|n)");
                    resp = sc.next().charAt(0);
                    if (resp == 'n') {
                        System.out.println("Saindo do sistema...");
                        sistemaAtivo = true;
                        break;
                    } else {
                        System.out.println("\nRetornando ao Menu de Escolhas...\n");
                        calc.iniciarSistema();
                    }

                case 5:
                    System.out.println("Saindo do sistema...");
                    sistemaAtivo = true;
                    break;


            }


        } while (!sistemaAtivo);


    }
}
