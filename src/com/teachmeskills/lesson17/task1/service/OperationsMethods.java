package com.teachmeskills.lesson17.task1.service;

/**
 * This class contain main method "doOperation" which implement our OperationsFunc interface.
 */

import com.teachmeskills.lesson17.task1.func_interfeace.OperationsFunc;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsMethods {
    public static void doOperation() {
        System.out.print("Enter the code of operation: ");
        try (Scanner scanner = new Scanner(System.in);) {
            int scan = scanner.nextInt();
            if (scan == 1) {
                OperationsFunc<String> testOp;
                testOp = (str) -> new StringBuilder(str).reverse().toString();
                System.out.print("Enter the string: ");
                System.out.println(testOp.makeOperation(scanner.next()));
            } else if (scan == 2) {
                OperationsFunc<Integer> testOp;
                testOp = (var) -> {
                    int result = 1;
                    for (int i = 1; i <= var; i++) {
                        result *= i;
                    }
                    return result;
                };
                System.out.print("Enter the number: ");
                System.out.println(testOp.makeOperation(scanner.nextInt()));
            } else {
                System.out.println("Error");
            }
        } catch (InputMismatchException e) {
            System.out.println("Only numbers allowed");
        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }

}
