package com.bvan.javaoop.lessons5_6.fs.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends NamedFSItem {

    private List<FSItem> items = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        items.add(item);
        return this;
    }

    @Override
    public int getSize() {
        int sizeSum = 0;

        for (FSItem item : items) {
            sizeSum += item.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        return "d" + items;
    }
}
