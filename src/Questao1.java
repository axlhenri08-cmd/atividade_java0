import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
         int numero1 = input.nextInt();
         System.out.print(("Digite outro numero: "));
         int numero2 = input.nextInt();

         int soma = numero1 + numero2;
         System.out.print("A soma dos valores é: " + soma);



    }

}