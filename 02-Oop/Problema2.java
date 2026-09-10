import java.util.Scanner;
public class Problema2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        double areaX, areaY;
        double pX, pY;
        char higher;
        System.out.println("Enter the measures of each side of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of each side of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        pX = (xA + xB + xC)/2;
        areaX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));
        pY = (yA + yB + yC)/2;
        areaY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));

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
