import java.util.Scanner;
import entities.Triangle;
public class Problemaotimizado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle ();
        y = new Triangle();
        double areaX, areaY;
        double pX, pY;
        char higher;
        System.out.println("Enter the measures of each side of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of each side of triangle Y: ");
        y.a = sc.nextDouble();
        y.a = sc.nextDouble();
        y.a = sc.nextDouble();
        pX = (x.a + x.b + x.c)/2;
        areaX = Math.sqrt(pX*(pX-x.a)*(pX-x.a)*(pX-x.c));
        pY = (y.a + y.a + y.b)/2;
        areaY = Math.sqrt(pY*(pY-y.a)*(pY-y.b)*(pY-y.c));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle T area: " + areaY);

        if (areaX > areaY){
            higher = 'X';
        } else if (areaX == areaY ){
            System.out.println("The triangles have the same area!");
            sc.close();
            return;
        } else{
            higher = 'Y';
            
        }
        System.out.println("Lager area is: " + higher);

        sc.close();
    }


    
}
