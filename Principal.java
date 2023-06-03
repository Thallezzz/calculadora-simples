import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();
        Scanner entrada = new Scanner(System.in);

        String menu = "O que você deseja fazer? \n 1. SOMAR \n 2. SUBTRAIR \n 3. MULTIPLICAR \n 4. DIVIDIR \n 5. SAIR";
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(menu);
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe o primeiro número: ");
                    calculos.setPrimeiroNumero(entrada.nextDouble());
                    System.out.println("Informe o segundo número: ");
                    calculos.setSegundoNumero(entrada.nextDouble());
                    calculos.soma();
                    System.out.println("A soma é " + calculos.getResultado());
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Informe o minuendo: ");
                    calculos.setPrimeiroNumero(entrada.nextDouble());
                    System.out.println("Informe o subtraendo: ");
                    calculos.setSegundoNumero(entrada.nextDouble());
                    calculos.subtrai();
                    System.out.println("A diferença é " + calculos.getResultado());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Informe o primeiro número: ");
                    calculos.setPrimeiroNumero(entrada.nextDouble());
                    System.out.println("Informe o segundo número: ");
                    calculos.setSegundoNumero(entrada.nextDouble());
                    calculos.multiplica();
                    System.out.println("O produto é " + calculos.getResultado());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Informe o dividendo: ");
                    calculos.setPrimeiroNumero(entrada.nextDouble());
                    System.out.println("Informe o divisor: ");
                    calculos.setSegundoNumero(entrada.nextDouble());
                    calculos.divide();
                    System.out.println("O quociente é " + calculos.getResultado());
                    System.out.println();
                    break;

                case 5:
                    System.out.println("OPERAÇÃO FINALIZADA");
                    break;

                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");
                    System.out.println();
            }

        }

    }
}
