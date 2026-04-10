package basic_calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, r, i, ctr = 0, power = 1, a = 0, b = 0, diff;
        float per = 0, ctrx = 0, c = 0, e = 0, f = 0, root, disc;

        System.out.println("Enter\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division\n" +
                " 5 for Power\n 6 for Factorial\n 7 for Percentage\n 8 for Permutation\n 9 for Combination\n" +
                " 10 for Roots of Quadratic Equation\n\nEnter here:");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Selected Addition:");
                System.out.print("Enter the number of terms: ");
                n = sc.nextInt();
                if (n == 0) {
                    System.out.println("You entered 0 terms so addition can't be performed.");
                } else {
                    ctr = 0;
                    for (i = 1; i <= n; i++) {
                        System.out.print("Enter value of term " + i + ": ");
                        a = sc.nextInt();
                        ctr += a;
                    }
                    System.out.println("The sum is " + ctr + ".");
                }
                break;

            case 2:
                System.out.println("Selected Subtraction:");
                System.out.print("Enter the number of terms: ");
                n = sc.nextInt();
                if (n == 0) {
                    System.out.println("You entered 0 terms so subtraction can't be performed.");
                } else {
                    System.out.print("Enter value of term 1: ");
                    b = sc.nextInt();
                    ctr = b;
                    for (i = 2; i <= n; i++) {
                        System.out.print("Enter value of term " + i + ": ");
                        a = sc.nextInt();
                        ctr -= a;
                    }
                    System.out.println("The result after subtraction is " + ctr + ".");
                }
                break;

            case 3:
                System.out.println("Selected Multiplication:");
                System.out.print("Enter number of terms: ");
                n = sc.nextInt();
                if (n == 0) {
                    System.out.println("You entered 0 terms so multiplication can't be performed.");
                } else {
                    power = 1;
                    for (i = 1; i <= n; i++) {
                        System.out.print("Enter value of term " + i + ": ");
                        a = sc.nextInt();
                        power *= a;
                    }
                    System.out.println("The product is " + power + ".");
                }
                break;

            case 4:
                System.out.println("Selected Division:");
                System.out.print("Enter the biggest number: ");
                a = sc.nextInt();
                System.out.print("Enter the second number: ");
                b = sc.nextInt();
                if (b == 0) {
                    System.out.println("Result is undefined.");
                } else if (a % b == 0) {
                    System.out.println("The quotient is " + (a / b) + ".");
                } else {
                    System.out.println("The quotient is " + (a / b) + " and remainder is " + (a % b) + ".");
                }
                break;

            case 5:
                System.out.println("Selected Power:");
                System.out.print("Enter base: ");
                a = sc.nextInt();
                System.out.print("Enter exponent: ");
                b = sc.nextInt();
                power = 1;
                if (b == 0) {
                    System.out.println(a + " to the power " + b + " is 1.");
                } else if (a == 0) {
                    System.out.println(a + " to the power " + b + " is 0.");
                } else {
                    for (i = 1; i <= b; i++) {
                        power *= a;
                    }
                    System.out.println(a + " to the power " + b + " is " + power + ".");
                }
                break;

            case 6:
                System.out.println("Selected Factorial:");
                System.out.print("Enter the number: ");
                a = sc.nextInt();
                power = 1;
                if (a == 0 || a == 1) {
                    System.out.println("The factorial of " + a + " is 1.");
                } else {
                    for (i = 1; i <= a; i++) {
                        power *= i;
                    }
                    System.out.println("The factorial of " + a + " is " + power + ".");
                }
                break;

            case 7:
                System.out.println("Selected Percentage:");
                System.out.print("Enter the number of terms: ");
                n = sc.nextInt();
                if (n == 0) {
                    System.out.println("You entered 0 terms so can't calculate percentage.");
                } else {
                    ctrx = 0;
                    for (i = 1; i <= n; i++) {
                        System.out.print("Enter value of term " + i + ": ");
                        c = sc.nextFloat();
                        ctrx += c;
                    }
                    if (ctrx < 0) {
                        System.out.println("Wrong input, try again.");
                    } else {
                        per = ctrx / n;
                        System.out.println("The percentage is " + per + ".");
                    }
                }
                break;

            case 8:
                System.out.println("Selected Permutation (nPr):");
                System.out.print("Enter n: ");
                n = sc.nextInt();
                System.out.print("Enter r: ");
                r = sc.nextInt();
                diff = n - r;
                float factN = 1, factDiff = 1;
                for (i = 1; i <= n; i++) factN *= i;
                for (i = 1; i <= diff; i++) factDiff *= i;
                ctrx = factN / factDiff;
                System.out.println("The permutation is " + ctrx + ".");
                break;

            case 9:
                System.out.println("Selected Combination (nCr):");
                System.out.print("Enter n: ");
                n = sc.nextInt();
                System.out.print("Enter r: ");
                r = sc.nextInt();
                diff = n - r;
                factN = factDiff = 1;
                float factR = 1;
                for (i = 1; i <= n; i++) factN *= i;
                for (i = 1; i <= diff; i++) factDiff *= i;
                for (i = 1; i <= r; i++) factR *= i;
                ctrx = factN / (factDiff * factR);
                System.out.println("The combination is " + ctrx + ".");
                break;

            case 10:
                System.out.println("Solving Quadratic Equation ax² + bx + c = 0");
                System.out.print("Enter coefficient a: ");
                c = sc.nextFloat();
                System.out.print("Enter coefficient b: ");
                e = sc.nextFloat();
                System.out.print("Enter constant c: ");
                f = sc.nextFloat();

                disc = (e * e) - (4 * c * f);

                if (c == 0 && e == 0) {
                    System.out.println("No solution.");
                } else if (c == 0) {
                    root = -f / e;
                    System.out.println("One solution: " + root);
                } else if (disc < 0) {
                    System.out.println("No real roots.");
                } else {
                    System.out.println("Two real roots:");
                    root = (float) ((-e + Math.sqrt(disc)) / (2 * c));
                    System.out.println("Root 1: " + root);
                    root = (float) ((-e - Math.sqrt(disc)) / (2 * c));
                    System.out.println("Root 2: " + root);
                }
                break;

            default:
                System.out.println("INVALID ENTRY. Please check and try again.");
        }

        sc.close();
    }
}

