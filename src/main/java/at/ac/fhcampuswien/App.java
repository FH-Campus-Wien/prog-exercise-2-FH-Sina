package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        int x = 1;
        double n;
        double biggestNumber = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Number " + x);
        System.out.print(": ");
        n = s.nextDouble();
        biggestNumber = n;
        if (n <= 0) {
            System.out.println("No number entered.");
        } else {
            do {
                x++;
                System.out.print("Number " + x);
                System.out.print(": ");
                n = s.nextDouble();
                if (biggestNumber <= n) {
                    biggestNumber = n;
                }
            }
            while (n > 0);
            System.out.println("The largest number is " + String.format("%.2f", biggestNumber));
        }
    }

    //todo Task 2
    public void stairs() {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.print("n: ");
        x = s.nextInt();
        if (x <= 0) {
            System.out.println("Invalid number!");
        } else {
            int counter = 1;
            for (int i = 0; i < x; i++) {

                for (int j = 0; i >= j; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println("");
            }
        }
    }

    //todo Task 3
    public void printPyramid() {

        int c = 6;
        int space = 5;
        int stars = 1;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            space--;
            stars = stars + 2;
            System.out.println();
        }

    }


    //todo Task 4
    public void printRhombus() {
        // input your solution here
    }

    //todo Task 5
    public void marks() {
        double counterValidMarks = 0;
        int x;
        double sum = 0;
        int negatives = 0;
        int counter = 0;
        Scanner s = new Scanner(System.in);
        counter++;
        System.out.print("Mark " + counter + ": ");
        x = s.nextInt();
        if (x == 0) {
           System.out.println("Average: 0.00");
            System.out.println("Negative marks: 0");
           return;
        }
        while (x >= 0) {

            if (x < 5 && x > 0) {
                counter++;
                System.out.print("Mark " + counter + ": ");
                sum = sum + x;
                counterValidMarks++;
                x = s.nextInt();
            } else if (x == 5) {
                negatives++;
                counter++;
                System.out.print("Mark " + counter + ": ");
                sum = sum + x;
                counterValidMarks++;
                x = s.nextInt();
            } else if (x == 0) {
                System.out.println("Average: " + String.format("%.2f", (sum / counterValidMarks) ));
                System.out.println("Negative marks: " + negatives);
                break;
            } else {
                System.out.println("Invalid mark!");
                System.out.print("Mark " + counter + ": ");
                x = s.nextInt();
            }
            while (x < 0) {
                System.out.println("Invalid mark!");
                System.out.print("Mark " + counter + ": ");
                x = s.nextInt();
            }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.print("n: ");
        x = s.nextInt();
        int digit1;
        int digit2;
        int digit3;
        int newx;

        while (x > 0) {
            digit1 = (x / 100 % 10);
            digit2 = (x / 10 % 10);
            digit3 = (x % 10);
            newx = digit1 * digit1 + digit2 * digit2 + digit3 * digit3;
            x = newx;

            if (x == 1) {
                System.out.println("Happy number!");
                break;
            } else if (x == 4) {
                System.out.println("Sad number!");
                break;
            }
        }


    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}