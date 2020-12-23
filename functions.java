package com.company;

import java.util.Scanner;

public class functions {
    public static void main(String []args) {
        System.out.print("\nWelcome to my functions project\n\nprogrammed by @ysr075 on GitHub");
        while(true) {
            Scanner input = new Scanner(System.in);
            String choose;
            System.out.print("\n\nAND / OR / NOT: ");
            choose = input.nextLine();
            if (choose.equals("1") || choose.equals("AND") || choose.equals("and")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                if ((IF1 < 0) || (IF1 > 1)) {
                    System.exit(1);
                }
                Integer IF2;
                System.out.print("IF2: ");
                IF2 = input.nextInt();
                if ((IF2 < 0) || (IF2 > 1)) {
                    System.exit(1);
                } else if (IF1.equals(1) && (IF2.equals(1))) {
                    System.out.print("\nlamp aan.");
                } else if (IF1.equals(0) && (IF2.equals(0))) {
                    System.out.print("\nlamp uit.");
                } else if (IF1.equals(0) && (IF2.equals(1))) {
                    System.out.print("\nlamp uit.");
                } else if (IF1.equals(1) && (IF2.equals(0))) {
                    System.out.print("\nlamp uit.");
                } else {
                    System.exit(1);
                }
            } else if (choose.equals("2") || choose.equals("OR") || choose.equals("or")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                if ((IF1 < 0) || (IF1 > 1)) {
                    System.exit(1);
                }
                Integer IF2;
                System.out.print("IF2: ");
                IF2 = input.nextInt();
                if ((IF2 < 0) || (IF2 > 1)) {
                    System.exit(1);
                } else if (IF1.equals(1) && (IF2.equals(1))) {
                    System.out.print("\nlamp aan.");
                } else if (IF1.equals(0) && (IF2.equals(0))) {
                    System.out.println("\nlamp uit.");
                } else if (IF1.equals(1) && (IF2.equals(0))) {
                    System.out.print("\nlamp aan.");
                } else if (IF1.equals(0) || (IF2.equals(1))) {
                    System.out.print("\nlamp aan.");
                } else {
                    System.exit(1);
                }
            } else if (choose.equals("3") || choose.equals("NOT") || choose.equals("not")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                if ((IF1 < 0) || (IF1 > 1)) {
                    System.exit(1);
                } else if (IF1.equals(1)) {
                    System.out.print("\nlamp uit.");
                } else if (IF1.equals(0)) {
                    System.out.print("\nlamp aan.");
                } else {
                    System.exit(1);
                }
            } else {
                System.exit(1);
            }
        }
    }
}

