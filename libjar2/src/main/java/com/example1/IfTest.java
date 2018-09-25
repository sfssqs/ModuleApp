package com.example1;

public class IfTest {

    private static final boolean DEBUG = false;

    public static void main(String args[]) {
        IfTest it = new IfTest();
        it.setName("sunpro");
    }

    public void setName(String name) {
        if (DEBUG)
            System.err.println(name);

    }
}