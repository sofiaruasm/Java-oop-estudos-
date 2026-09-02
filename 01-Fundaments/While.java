import java.util.Scanner;
public class While {
    public static void main (String[] args){
        int numero;
        int soma = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = x.nextInt();
        while (numero != 0){
            soma += numero;
            numero = x.nextInt();
        }
        System.out.println("A soma dos números digitados é: "+ soma );
        x.close();

    }
}
