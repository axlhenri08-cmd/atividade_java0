import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um palavra: ");
        String original = input.next();

        String invertida = new StringBuilder(original).reverse().toString();
        System.out.print("Resultado: " + invertida);
    }
}
