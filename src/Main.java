import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;
        double width = 0.0;
        double height = 0.0;
        do {
            System.out.println("Enter the width: ");
            width = scanner.nextDouble();
            System.out.println("Enter the height: ");
            height = scanner.nextDouble();

            if (height > 0.0) {
                ready = true;
                if (height > 0.0) {
                    ready = true;
                }else ready = false;
            }else ready = false;
        }while (!ready);
    double side3 = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("The length of the diagonal line is: " +side3);
        double slantedSide = width + height + side3;
        System.out.println("The perimiter of the triangle is: " +slantedSide);


    }
}