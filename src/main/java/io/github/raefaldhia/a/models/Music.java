package io.github.raefaldhia.a.models;

import io.github.raefaldhia.a.interfaces.IStreamable;

public class Music implements IStreamable {
    private final String
    artist;
    
    private final String
    album;
    
    private Integer
    length;
    
    private Integer
    bytesSent;

    public Music(final String artist, final String album, final int length, final int bytesSent) {
        this.artist = artist;
        this.album = album;
        this.setLength(length);
        this.setBytesSent(bytesSent);
    }

    @Override
    public Integer getLength() {
        return this.length;
    }

    public void setLength(final Integer length) {
        this.length = length;
    }

    @Override
    public Integer getBytesSent() {
        return this.bytesSent;
    }

    public void setBytesSent(final Integer bytesSent) {
        this.bytesSent = bytesSent;
    }
}