package homework6;

import java.util.Scanner;

public class ProgrammeEight {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height of the triangle:");
        int h = s.nextInt();
        System.out.println("Enter the base value of triangle:");
        int b = s.nextInt();
        float a = ((h*b)*2);
        System.out.println("Area of a triangle is :"+a);




    }
}


