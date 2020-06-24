package io.github.raefaldhia.c.models;

import java.util.List;

public class Manager extends Employee {
    private List<String>
    documents;

    public Manager(final String name, final List<String> documents) {
        super(name);

        this.documents = documents;
    }

    public List<String> getDocuments() {
        return this.documents;
    }

    @Override
    public String toString() {
        return super.toString() + "Documents: " + String.join(System.lineSeparator(), this.documents);
    }
}