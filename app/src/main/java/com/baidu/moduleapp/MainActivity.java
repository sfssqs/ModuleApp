package com.baidu.moduleapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.AudioFactory;
import com.example.IAudio;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            IAudio audio = AudioFactory.getAudioInstant("AudioC");
            audio.startAudio();
        } catch (Exception e) {

        }
    }
}
