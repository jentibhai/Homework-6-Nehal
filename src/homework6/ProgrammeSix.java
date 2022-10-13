package homework6;

import java.util.Scanner;

public class ProgrammeSix {
    public static void main(String[] args) {
        double radius,area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius value");
        radius = scan.nextInt();

        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is"+area);


    }
}
