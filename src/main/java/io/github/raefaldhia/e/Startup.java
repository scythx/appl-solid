package io.github.raefaldhia.e;

import io.github.raefaldhia.e.models.KeyCardCheck;
import io.github.raefaldhia.e.models.PinCodeCheck;
import io.github.raefaldhia.e.models.ScannerUI;
import io.github.raefaldhia.e.models.SecurityManager;


public class Startup {
    public static void main(final String[] args) {
        final ScannerUI
        scannerUI = new ScannerUI();
        
        final SecurityManager
        manager = new SecurityManager(new KeyCardCheck(scannerUI),
                                      new PinCodeCheck(scannerUI));

        manager.check();
    }
}