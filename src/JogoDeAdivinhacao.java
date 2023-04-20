import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    private static  Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
        __________________________________
         Bem-vindo ao jogo de adivinhação! 
        __________________________________
        """);
        jogo();

        System.out.println("Encerrando...");

    }
    public static void jogo() {
        int tentativa = 0;
        int numeroGerado = random.nextInt(100);

        for (int i = 1; i < 5 ; i++) {
            System.out.println("Por gentileza, digite seu numero");
            tentativa = scanner.nextInt();

            if(tentativa == numeroGerado) {
                System.out.println("""
                
               _______________________
                Parabens! 
                Voce acertou o número!
               _______________________
                """);
                break;
            } else {
                System.out.println("Numero incorreto, tente novamente!");

                if(tentativa > numeroGerado) {
                    System.out.println("""                
                O numero digitado é maior que o número correto.""");
                } else  {
                    System.out.println("""
                O numero digitado é menor que o número correto.""");
                }
                if (i == 4)
                System.out.println("""
                        
                       ___________________________
                        Suas tentativas acabaram!                       
                        GAME OVER
                       ___________________________
                        """);
            }
        }
    }
}
