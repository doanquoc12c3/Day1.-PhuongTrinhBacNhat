package com.codegym;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Lineaer Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.printf("c: ");
        double c = scanner.nextDouble();

        if( a != 0){
            double answer = (c - b)/a;
            System.out.println("Result: " + answer);
        }
    }
}
