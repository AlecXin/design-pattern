package com.ears.principle.lsp;

public class Square extends Rectangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return getLength();
    }

    public long getHeight() {
        return getLength();
    }

    public void setHeight(long height) {
        setLength(height);
    }


    public void setWidth(long width) {
        setLength(width);
    }


}
