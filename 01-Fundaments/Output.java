import java.util.Locale;
public class Output {

    public static void main(String[] args){
        int y = 32;
        double x = 3.23494;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Sua idade é " +y+ " anos");

    }
}
