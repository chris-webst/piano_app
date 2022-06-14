package com.example.pianoapp;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This is a testing class showing differences
 * between MediaPlayer and SoundPool.
 **/
public class Test extends AppCompatActivity implements View.OnClickListener {


    // First two buttons will be played by MediaPlayer.
    MediaPlayer mediaPlayerOb;
    Button butt1;
    Button butt2;

    // Second two buttons will be played by SoundPool.
    SoundPool soundPoolOb;
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
        butt1 = (Button) findViewById(R.id.button_7);
        butt1.setOnClickListener(this);

        butt2 = (Button) findViewById(R.id.button_17);
        butt2.setOnClickListener(this);

        butt3 = (Button) findViewById(R.id.button_27);
        butt3.setOnClickListener(this);

        butt4 = (Button) findViewById(R.id.button_37);
        butt4.setOnClickListener(this);

        soundPoolOb = new SoundPool.Builder()
                .setMaxStreams(6)
                .build();

        for3 = soundPoolOb.load(this, R.raw.butt27, 1);
        for4 = soundPoolOb.load(this, R.raw.butt37, 1);

    }

    @Override
    public void onClick(View view) {

        /**
         * Make a decision wheter to use SoundPool or MediaPlayer
         * and play the note specified in the raw folder
         * (IDs should match the real notes).
         */
        switch (view.getId()){

            case R.id.button_7:

                mediaPlayerOb = MediaPlayer.create(getApplicationContext(),
                        R.raw.butt7);
                mediaPlayerOb.start();
                break;

            case R.id.button_17:

                mediaPlayerOb = MediaPlayer.create(getApplicationContext(),
                        R.raw.butt17);
                mediaPlayerOb.start();
                break;

            case R.id.button_27:

                soundPoolOb.play(for3, 1, 1, 0, 0, 1);
                break;

            case R.id.button_37:

                soundPoolOb.play(for4, 1, 1, 0, 0, 1);
                break;

        }

    }
}