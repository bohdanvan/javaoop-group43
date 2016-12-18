package com.bvan.javaoop.lessons6_7.fs.procedural;

/**
 * @author bvanchuhov
 */
public class ProcFSRunner {

    public static void main(String[] args) {
        ProcDirectory root = new ProcDirectory()
                .add(new ProcFile(30))
                .add(new ProcDirectory()
                        .add(new ProcFile(20))
                        .add(new ProcDirectory()
                                .add(new ProcFile(10))
                        )
                )
                .add(new ProcDirectory());


        System.out.println(root.getSize());

        System.out.println(root);
    }
}
