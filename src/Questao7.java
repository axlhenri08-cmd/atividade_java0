import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = -1;
        int soma = 0;

        System.out.println("Digite os números para somar (Digite 0 para parar) ");

        while (num != 0){
            System.out.println("Digite o número: ");
            num = input.nextInt();

            soma += num;
            System.out.println("---------------------------");
            System.out.println("A soma total é: " + soma);
        }
    }
}
