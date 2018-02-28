package com.simplilearn.main;

import com.simplilearn.service.NumberToWordConverterService;

import java.util.Scanner;

import static java.lang.System.exit;

public class NumberConverter {

    public static void main(String[] args) {

        System.out.println("Please enter the number to be converted to words: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String numberStr = scanner.next();
            try {
                Integer number = Integer.parseInt(numberStr);
                if (number == 0) {
                    exit(0);
                }
                if (number >= 1 && number <= 999) {
                    String numberAsWords = new NumberToWordConverterService().convertNumberToWords(number);
                    System.out.println(String.format("Words equivalent to number %s is :%s", number, numberAsWords));
                } else {
                    System.out.println("We can only accept numbers between 1 and 999");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter the valid number");
            }
            System.out.println("Press 0 to exit or enter number between 1 and 999 to continue");
        }
    }
}
