import java.util.Scanner;
public class Dowhile {
    public static void main(String[]args){
        double celsius;
        double farenheit;
        char answer;

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Digite uma temperatura em Celsius: ");
            celsius = sc.nextDouble();
            farenheit = ((9*celsius)/ 5) + 32;
            System.out.printf("O equivalente em farenheit é %.1f%n", farenheit);
            System.out.println("Deseja repetir (S/N)? ");
            answer = sc.next().charAt(0);

        }while(answer != 'N' && answer != 'n');

        sc.close();

    }
    
}
