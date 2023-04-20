import java.util.Scanner;

public class ScreenMatch {
    private  static double valor = 0;
    private  static int opcaoCliente = 0;
    private  static double saldo = 1600;
    private static  String tipoConta = "CORRENTE";
    private static String nome = "Clark";
    private static Scanner entrada = new Scanner(System.in);

// Etapas de desenvolvimento
    /*
    *  Inicializar dados do cliente
    *  Menu de opcoes
    *  Visualizacao do saldo
    *  Envia valor
    *  Recebe valor
    */
    public static void main(String[] args) {
        dadosCliente();
        menuOpcoes();
    }

    public static void dadosCliente() {
        System.out.println("*********************************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************************");
    }
    public static void menuOpcoes() {
        while (opcaoCliente != 4) {
            System.out.println("Menu");
            System.out.println("""
                1- Visualizar saldo
                2- Tranferir
                3- Sacar
                4- Sair
                """);
            opcaoCliente = entrada.nextInt();
            switch (opcaoCliente) {
                case 1:
                    visualizarSaldo();
                    break;
                case 2:
                    transferir();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    opcaoCliente = 4;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    public static void visualizarSaldo() {
        System.out.println("O saldo atual: " + saldo);
    }

    public static double transferir() {
        System.out.println("""
                Transferencia
                
                Digite o valor que deseja transferir """);
        valor = entrada.nextDouble();
        saldo -= valor;
        return saldo;
    }
    public static double sacar() {
        System.out.println("""
                Saque
                
                Digite o valor""");
        valor = entrada.nextDouble();
        saldo -= valor;
        return saldo;
    }

}
