package io.github.raefaldhia.a.models;

import io.github.raefaldhia.a.interfaces.IStreamable;

public class File implements IStreamable {
    private final String
    name;
    
    private Integer
    length;
    
    private Integer
    bytesSent;

    public File(final String name, final Integer length, final Integer bytesSent) {
        this.name = name;
        this.setLength(length);
        this.setBytesSent(bytesSent);
    }

    @Override
    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public Integer getBytesSent() {
        return this.bytesSent;
    }

    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }
}