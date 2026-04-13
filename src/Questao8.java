import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.print("Status: Menor de idade!");
        }
        else if (idade >= 18 && idade < 60) {
            System.out.print("Status: Maior de idade!");
        }
        else {
            System.out.print("Status: idoso(+60)");
        }
    }
}
