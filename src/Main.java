import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Digite um número de zero a dez:");
        var numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++){
            var resultado = numero * i;
            System.out.println(resultado);
        }
    }
}