import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int senha_certa = 121426;

        while (true) {
            System.out.print("Digite a senha: ");
            int senha = input.nextInt();

            if (senha == senha_certa) {
                System.out.println("Senha correta!");
                break;
            } else {
                System.out.println("Senha incorreta, Tente novamente!");
            }
        }
    }
}
