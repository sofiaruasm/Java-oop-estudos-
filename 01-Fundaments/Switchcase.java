import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args){
        int x;
        String dia;
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        x = numero.nextInt();
        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabádo";
                break;
            default:
                dia = "Valor invalído";
                break;
        }
        System.out.println("O número corresponde a "+ dia);
        numero.close();

    }
    
}
