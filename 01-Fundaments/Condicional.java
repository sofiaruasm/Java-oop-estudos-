import java.util.Scanner;
public class Condicional {
    public static void main(String[] args){
        int x;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número:");
        x = num.nextInt();
        if (x<=4){
            System.out.println("Número dentro do intervalo desejado, o número é " + x);

        }
        else{
            System.out.println("Número invalído, digite um número menor ou igual a 4");
        }


        num.close();
    }
}
