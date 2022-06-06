/**
 * This is a testing class showing differences
 * between MediaPlayer and SoundPool.
  */
package com.example.pianoapp;

import  android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity implements View.OnClickListener {

    // First two buttons will be played by MediaPlayer.
    MediaPlayer mediaPlayer;
    Button butt1;
    Button butt2;

    // Second two buttons will be played by SoundPool.
    SoundPool soundPool;
    Button butt3;
    Button butt4;
    // SoundPool needs to orient itself with the ints representing the notes.
    int for3;
    int for4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // Initialize the buttons to be able to react to the touch.
        butt1 = (Button) findViewById(R.id.button);
        butt1.setOnClickListener(this);

        butt2 = (Button) findViewById(R.id.button_2);
        butt2.setOnClickListener(this);

        butt3 = (Button) findViewById(R.id.button_3);
        butt3.setOnClickListener(this);

        butt4 = (Button) findViewById(R.id.button_4);
        butt4.setOnClickListener(this);

        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .build();

        for3 = soundPool.load(this, R.raw.butt3, 1);
        for4 = soundPool.load(this, R.raw.butt4, 1);

    }

    @Override
    public void onClick(View view) {

        /**
         * Make a decision wheter to use SoundPool or MediaPlayer
         * and play the note specified in the raw folder
         * (IDs should match the real notes).
         */
        switch (view.getId()){

            case R.id.button:

                mediaPlayer = mediaPlayer.create(getApplicationContext(),
                        R.raw.butt1);
                mediaPlayer.start();
                break;

            case R.id.button_2:

                mediaPlayer = mediaPlayer.create(getApplicationContext(),
                        R.raw.butt2);
                mediaPlayer.start();
                break;

            case R.id.button_3:

                soundPool.play(for3, 1, 1, 0, 0, 1);
                break;

            case R.id.button_4:

                soundPool.play(for4, 1, 1, 0, 0, 1);
                break;

        }

    }
}