package io.github.raefaldhia.c;

import java.util.Arrays;

import io.github.raefaldhia.c.models.DetailsPrinter;
import io.github.raefaldhia.c.models.Employee;
import io.github.raefaldhia.c.models.Manager;

public class Startup {
    public static void main(final String[] args) {
        final DetailsPrinter
        printer = new DetailsPrinter(Arrays.asList(new Employee("Name"),
                                                   new Manager("Manager name",
                                                               Arrays.asList("document-1",
                                                                             "document-2",
                                                                             "document-3"))));

        printer.printDetails();
    }
}