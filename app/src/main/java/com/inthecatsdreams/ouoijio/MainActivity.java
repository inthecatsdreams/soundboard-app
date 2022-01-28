package com.inthecatsdreams.ouoijio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(context, R.raw.fart);
        final Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(context, R.raw.fart);
                        mp.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        final Button niggerB = (Button) findViewById(R.id.button2);
        niggerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp.release();
                    mp = MediaPlayer.create(context, R.raw.nigger);
                    mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
}