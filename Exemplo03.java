import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        int divisao = a/b;

        System.out.println("Resultados: ");
        System.out.println("soma: "+soma);
        System.out.println("subtração: "+sub);
        System.out.println("multiplicação: "+mult);
        System.out.println("divisão: "+divisao);

        
        sc.close();
    }
}
