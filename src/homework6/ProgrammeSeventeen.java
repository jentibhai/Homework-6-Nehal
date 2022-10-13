package homework6;

import java.util.Scanner;

public class ProgrammeSeventeen {
    public static void main(String[] args) {
        int number;
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("/n Enter number to conversion");
        number = sc.nextInt();
        //conversion using method
        String binarystr = Integer.toBinaryString(number);
        System.out.println("/n Binary value is :"+ binarystr);



    }
}
