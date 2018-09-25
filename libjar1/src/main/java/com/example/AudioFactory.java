package com.example;

public class AudioFactory {
    public static IAudio getAudioInstant(String type) throws NoSuchMethodException {
        if (type.equalsIgnoreCase(AudioB.class.getSimpleName())) {
            return new AudioB();
        } else if (type.equalsIgnoreCase(AudioC.class.getSimpleName())) {
            return new AudioC();
        } else {
            throw new NoSuchMethodException();
        }
    }
}
