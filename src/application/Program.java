package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measure of triangle X: ");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y: ");
            yA = sc.nextDouble();
            yB = sc.nextDouble();
            yC = sc.nextDouble();

        double p = ((xA + xB + xC)/2) ;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
        p = ((yA + yB + yC)/2) ;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("The triangle X: %.4f%n", areaX);
        System.out.printf("The triangle Y: %.4f%n" , areaY);
        System.out.println("#########################");
        if (areaX > areaY) {
            System.out.println("Largest triangle area is X");
        } else {
            System.out.println("The Largest triangle area is Y");
        }




        sc.close();
    }
}
