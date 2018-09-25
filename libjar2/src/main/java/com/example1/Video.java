package com.example1;

public class Video {
    private static final int DEBUG = 0;

    public void startVideo() {
        if (DEBUG == 0) {
            System.out.println("startVideo");
        }
    }

    public void stopVideo() {
        if (DEBUG == 1) {
            System.out.println("startVideo");
        }
    }
}
