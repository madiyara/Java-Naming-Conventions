import java.sql.SQLOutput;

import java.util.Scanner;

public class HelloAndAdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine ();

        System.out.println("Hello," + name);

        System.out.println("What is your lucky number?");

        int num1 = Integer.parseInt (scan.nextLine());

        System.out.println("what is your  lucky number?");

        int num2 = Integer.parseInt (scan.nextLine());

        System.out.println("what is your  other  lucky number?");

        int sum = num1 + num2 ;

        System.out.println("The some of your numbers is  " + sum);




    }
}
