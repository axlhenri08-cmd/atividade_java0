import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.print("\nTabuada de " + numero + ":");

        for (int x = 1; x <= 10; x++){
            int resultado = numero * x;
            System.out.println("A atbuada é: " + resultado);
        }
    }
}
