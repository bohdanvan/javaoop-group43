package com.bvan.javaoop.lessons5_6.fs.oop;

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
