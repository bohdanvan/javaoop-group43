package com.bvan.javaoop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public class Symlink extends NamedFSItem {

    public Symlink() {
    }

    public Symlink(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        return 1;
    }
}
