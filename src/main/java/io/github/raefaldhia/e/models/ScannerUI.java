package io.github.raefaldhia.e.models;

import java.util.Scanner;

import io.github.raefaldhia.e.interfaces.ISecurityUI;

public class ScannerUI implements ISecurityUI {
    @Override
    public String requestKeyCard() {
        System.out.println("Slide your key card");

        final Scanner 
        scanner = new Scanner(System.in);

        final String result;
        result = scanner.nextLine();

        scanner.close();

        return result;
    }

    @Override
    public int requestPinCode() {
        System.out.println("Enter your pin code:");

        final Scanner 
        scanner = new Scanner(System.in);

        final Integer
        result = scanner.nextInt();

        scanner.close();

        return result;
    }
}