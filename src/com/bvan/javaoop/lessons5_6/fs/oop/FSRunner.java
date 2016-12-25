package com.bvan.javaoop.lessons5_6.fs.oop;

/**
 * @author bvanchuhov
 */
public class FSRunner {

    public static void main(String[] args) {
        Directory root = new Directory()
                .add(new File(30))
                .add(new Directory()
                        .add(new File(20))
                        .add(new Directory()
                                .add(new File(10))
                        )
                )
                .add(new Directory())
                .add(new Symlink())
                .add(new Symlink());

        System.out.println(root.getSize());
    }
}
