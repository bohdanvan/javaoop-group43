package com.bvan.javaoop.lessons6_7.fs.oop;

/**
 * @author bvanchuhov
 */
public abstract class NamedFSItem implements FSItem {

    private String name;

    public NamedFSItem() {
        this("UNNAMED");
    }

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract int getSize();
}
