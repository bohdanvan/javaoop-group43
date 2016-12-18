package com.bvan.javaoop.lessons6_7.fs.oop;

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
