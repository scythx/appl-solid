package io.github.raefaldhia.a.models;

import io.github.raefaldhia.a.interfaces.IStreamable;

public class StreamProgressInfo {
    private final IStreamable file;

    public StreamProgressInfo(final IStreamable file) {
        this.file = file;
    }

    public Integer CalculateCurrentPercent() {
        return this.file.getBytesSent() * 100 / this.file.getLength();
    }
}