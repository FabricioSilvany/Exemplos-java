import java.util.Scanner;

public class Cond01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        double num1 = sc.nextDouble();

        System.out.println("Digite outra nota:");
        double num2 = sc.nextDouble();

        double media = (num1+num2)/2;

        if (media>=7){
            System.out.println("Aprovado");
        }else if(media<7 && media>=5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}
