import java.util.Random;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int sorteado = gerador.nextInt(10) + 1;
        int palpite = 0;

        System.out.print("Adivinhe o número de 1 a 10: ");

        while (palpite != sorteado){
            palpite = input.nextInt();

            if (palpite != sorteado) {
                System.out.print("Incorreto. Tente novamente:");
            }
        }
        System.out.print("Correto. O número era: " + sorteado);
    }
}
