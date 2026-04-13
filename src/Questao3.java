import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.print("o numero e par: " + numero);

        } else {
            System.out.print("o numero e impar: " + numero);
        }
    }


}
