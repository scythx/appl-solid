package io.github.raefaldhia.e.models;

import java.util.Scanner;

public class SecurityManager {
    private final KeyCardCheck
    keyCardCheck;
    
    private final PinCodeCheck
    pinCodeCheck;

    public SecurityManager(final KeyCardCheck keyCardCheck, final PinCodeCheck pinCodeCheck) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }

    public void check() {
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");

        final Scanner
        scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println(this.keyCardCheck.validateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.validateUser());
                break;
        }

        scanner.close();
    }
}