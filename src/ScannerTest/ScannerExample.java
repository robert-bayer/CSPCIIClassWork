/**
 * Description: Introduces using Scanner objects
 * @author:  Robert Bayer
 * @version: August 27, 2021
 */

package ScannerTest;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){

        Scanner stdinScanner;
        stdinScanner = new Scanner (System.in);
        String name;
        String month;
        int number;

        System.out.print("Hello! What is your first name? ");
        name = stdinScanner.next();
        System.out.println( name + " is a great name!");

        System.out.print("What month were you born? ");
        month = stdinScanner.next();
        System.out.println( month + " is a great month to be born!");

        System.out.print("What is your favorite number? ");
        number = stdinScanner.nextInt();
        System.out.println( number + " is a great favorite number!");

        //Exercises
        String Name2;
        int teeth;
        String joke;

        System.out.print("What is your name? ");
        Name2 = stdinScanner.next();
        System.out.println( Name2 + ", that's a cool name!");

        System.out.print("How many teeth do you have on your upper jaw? ");
        teeth = stdinScanner.nextInt();
        System.out.println("Wow, " + teeth + "? That's a lot of teeth.");
        teeth *= 2;
        System.out.println("That means you must have " + teeth + " total teeth!");

        System.out.print("Tell me a joke. ");
        do {
            System.out.print(stdinScanner.next() + " ");
        }
        while(stdinScanner.hasNext());



    }
}
