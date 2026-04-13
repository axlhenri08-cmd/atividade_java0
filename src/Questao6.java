import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número e eu mostrarei o fatorial: ");
        int numero = input.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;

            System.out.println("O fatorial de" + numero + "é:" + fatorial);
        }
    }
}