import java.util.Scanner;
public class Problema1 {
    public static void main(String[] args){
        int minutos;
        int preco;
        int excedencia;
        int valor;
        
        preco = 50;
        Scanner num = new Scanner(System.in);
        System.out.println("Quantos minutos de telefone você usou esse mês?");
        minutos = num.nextInt();
        if (minutos <= 100){
            System.out.println("Sua conta a pagar é " + preco + " reais");
        }
        else{
            excedencia = minutos - 100;
            valor = excedencia * 2;
            preco += valor;
            System.out.println("Sua conta a pagar é "+ preco + " reais");
        num.close();
            

        }
    }
    
}
