package com.bvan.javaoop.lessons6_7.fs.oop;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public File(int size) {
        checkSize(size);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        checkSize(size);
        this.size = size;
    }

    private void checkSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("not positive size: " + size);
        }
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}
