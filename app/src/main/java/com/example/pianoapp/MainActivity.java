package com.example.pianoapp;

import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Here are some features of the app that were implemented
 * according to the video tutorial stated in the README.md file
 * but might be done differently:
 *
 * This app uses audio files as a source of the actual tones
 * because it's easier to get, use and maintain them, however
 * MIDI could also be used.
 *
 * This app uses the OnClickListener interface because it's simpler.
 * Usage of OnTouchListener interface is also possible.
 *
 * This app uses SoundPool to handle audio files because it's
 * simple and there's no processing of large files. The alternative
 * to SoundPool is MediaPlayer.
 *
 * Sources of piano tones come from
 * https://freesound.org/people/TEDAgame/packs/25405/?page=4#sound
 * however, they're edited.
 *
 * Resources to the button designs:
 * <a target="_blank" href="https://icons8.com/icon/11686/arrow">
 * Arrow</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>
 *
 * <a target="_blank" href="https://icons8.com/icon/101955/music-record">
 * Music Record</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>
 *
 * <a target="_blank" href="https://icons8.com/icon/36333/add-record">
 * Add Record</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>
 *
 * <a target="_blank" href="https://icons8.com/icon/398/play">
 * Play</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // The functionality for playing notes.
    private SoundPool soundpool;

    // Buttons of the top navigation bar.
    private Button right_arrow;
    private Button left_arrow;
    private Button record;
    private Button play;

    // The view in which the keyboard will be displayed in?
    private HorizontalScrollView scrollView;

    // All the keys (buttons) that will be used.
    private Button butt1;
    private Button butt2;  // black
    private Button butt3;
    private Button butt4;
    private Button butt5;  // black
    private Button butt6;
    private Button butt7;  // black
    private Button butt8;
    private Button butt9;
    private Button butt10;  // black
    private Button butt11;
    private Button butt12;  // black
    private Button butt13;
    private Button butt14;  // black
    private Button butt15;
    private Button butt16;
    private Button butt17;  // black
    private Button butt18;
    private Button butt19;  // black
    private Button butt20;
    private Button butt21;
    private Button butt22;  // black
    private Button butt23;
    private Button butt24;  // black
    private Button butt25;
    private Button butt26;  // black
    private Button butt27;
    private Button butt28;
    private Button butt29;  // black
    private Button butt30;
    private Button butt31;  // black
    private Button butt32;
    private Button butt33;
    private Button butt34;  // black
    private Button butt35;
    private Button butt36;  // black
    private Button butt37;
    private Button butt38;  // black
    private Button butt39;
    private Button butt40;
    private Button butt41;  // black
    private Button butt42;
    private Button butt43;  // black
    private Button butt44;
    private Button butt45;
    private Button butt46;  // black
    private Button butt47;
    private Button butt48;  // black
    private Button butt49;
    private Button butt50;  // black
    private Button butt51;
    private Button butt52;
    private Button butt53;  // black
    private Button butt54;
    private Button butt55;  // black
    private Button butt56;
    private Button butt57;
    private Button butt58;  // black
    private Button butt59;
    private Button butt60;  // black
    private Button butt61;
    private Button butt62;  // black
    private Button butt63;
    private Button butt64;
    private Button butt65;  // black
    private Button butt66;
    private Button butt67;  // black
    private Button butt68;
    private Button butt69;
    private Button butt70;  // black
    private Button butt71;
    private Button butt72;  // black
    private Button butt73;
    private Button butt74;  // black
    private Button butt75;
    private Button butt76;
    private Button butt77;  // black
    private Button butt78;
    private Button butt79;  // black
    private Button butt80;
    private Button butt81;
    private Button butt82;  // black
    private Button butt83;
    private Button butt84;  // black
    private Button butt85;
    private Button butt86;  // black
    private Button butt87;
    private Button butt88;

    public MainActivity(SoundPool soundpool) {
        this.soundpool = soundpool;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Switch into the testing activity preview.
        testActivity();

        // Initialize the scroll view here.
        scrollView = findViewById(R.id.scrollView);

        // Initialize the keys with this method.
        initializeAllKeys();

        // Initialize the soundpool.
        soundpool = new SoundPool.Builder()
                .setMaxStreams(6)
                .build();

        // butt1 = soundpool.load(this, R.raw.butt1, 1);

        // Initialize the buttons of the navigation bar.
        left_arrow = (Button) findViewById(R.id.left_arrow);
        left_arrow.setOnClickListener(view -> {

            // Defines the speed and direction of scrolling.
            scrollView.scrollTo((int) scrollView.getScrollX() -30,
                    (int) scrollView.getScrollX() );

        });

        right_arrow = (Button) findViewById(R.id.right_arrow);
        right_arrow.setOnClickListener(view -> {

            // Defines the speed and direction of scrolling.
            scrollView.scrollTo((int) scrollView.getScrollX() +30,
                    (int) scrollView.getScrollY() );

        });

        record = (Button) findViewById(R.id.record);
        play = (Button) findViewById(R.id.play);
    }

    /**
     * This is a method used for initialization of the keys.
     * Each key (black or standard) is initialized as one button.
     *
     * So each button is linked with the ID specified
     * in the activity_main.xml file so it's clear
     * which key it represents.
     *
     * Then each button needs to be set by the setOnClickListener()
     * method so the user can interact and use the keys.
     **/
    void initializeAllKeys(){

        butt1 = (Button) findViewById(R.id.button);
        butt1.setOnClickListener(this);
        butt2 = (Button) findViewById(R.id.black1);
        butt2.setOnClickListener(this);
        butt3 = (Button) findViewById(R.id.button_2);
        butt3.setOnClickListener(this);
        butt4 = (Button) findViewById(R.id.button_3);
        butt4.setOnClickListener(this);
        butt5 = (Button) findViewById(R.id.black2);
        butt5.setOnClickListener(this);
        butt6 = (Button) findViewById(R.id.button_4);
        butt6.setOnClickListener(this);
        butt7 = (Button) findViewById(R.id.black3);
        butt7.setOnClickListener(this);
        butt8 = (Button) findViewById(R.id.button_5);
        butt8.setOnClickListener(this);
        butt9 = (Button) findViewById(R.id.button_6);
        butt9.setOnClickListener(this);
        butt10 = (Button) findViewById(R.id.black4);
        butt10.setOnClickListener(this);
        butt11 = (Button) findViewById(R.id.button_7);
        butt11.setOnClickListener(this);
        butt12 = (Button) findViewById(R.id.black5);
        butt12.setOnClickListener(this);
        butt13 = (Button) findViewById(R.id.button_8);
        butt13.setOnClickListener(this);
        butt14 = (Button) findViewById(R.id.black6);
        butt14.setOnClickListener(this);
        butt15 = (Button) findViewById(R.id.button_9);
        butt15.setOnClickListener(this);
        butt16 = (Button) findViewById(R.id.button_10);
        butt16.setOnClickListener(this);
        butt17 = (Button) findViewById(R.id.black7);
        butt17.setOnClickListener(this);
        butt18 = (Button) findViewById(R.id.button_11);
        butt18.setOnClickListener(this);
        butt19 = (Button) findViewById(R.id.black8);
        butt19.setOnClickListener(this);
        butt20 = (Button) findViewById(R.id.button_12);
        butt20.setOnClickListener(this);
        butt21 = (Button) findViewById(R.id.button_13);
        butt21.setOnClickListener(this);
        butt22 = (Button) findViewById(R.id.black9);
        butt22.setOnClickListener(this);
        butt23 = (Button) findViewById(R.id.button_14);
        butt23.setOnClickListener(this);
        butt24 = (Button) findViewById(R.id.black10);
        butt24.setOnClickListener(this);
        butt25 = (Button) findViewById(R.id.button_15);
        butt25.setOnClickListener(this);
        butt26 = (Button) findViewById(R.id.black11);
        butt26.setOnClickListener(this);
        butt27 = (Button) findViewById(R.id.button_16);
        butt27.setOnClickListener(this);
        butt28 = (Button) findViewById(R.id.button_17);
        butt28.setOnClickListener(this);
        butt29 = (Button) findViewById(R.id.black12);
        butt29.setOnClickListener(this);
        butt30 = (Button) findViewById(R.id.button_18);
        butt30.setOnClickListener(this);
        butt31 = (Button) findViewById(R.id.black13);
        butt31.setOnClickListener(this);
        butt32 = (Button) findViewById(R.id.button_19);
        butt32.setOnClickListener(this);
        butt33 = (Button) findViewById(R.id.button_20);
        butt33.setOnClickListener(this);
        butt34 = (Button) findViewById(R.id.black14);
        butt34.setOnClickListener(this);
        butt35 = (Button) findViewById(R.id.button_21);
        butt35.setOnClickListener(this);
        butt36 = (Button) findViewById(R.id.black15);
        butt36.setOnClickListener(this);
        butt37 = (Button) findViewById(R.id.button_22);
        butt37.setOnClickListener(this);
        butt38 = (Button) findViewById(R.id.black16);
        butt38.setOnClickListener(this);
        butt39 = (Button) findViewById(R.id.button_23);
        butt39.setOnClickListener(this);
        butt40 = (Button) findViewById(R.id.button_24);
        butt40.setOnClickListener(this);
        butt41 = (Button) findViewById(R.id.black17);
        butt41.setOnClickListener(this);
        butt42 = (Button) findViewById(R.id.button_25);
        butt42.setOnClickListener(this);
        butt43 = (Button) findViewById(R.id.black18);
        butt43.setOnClickListener(this);
        butt44 = (Button) findViewById(R.id.button_26);
        butt44.setOnClickListener(this);
        butt45 = (Button) findViewById(R.id.button_27);
        butt45.setOnClickListener(this);
        butt46 = (Button) findViewById(R.id.black19);
        butt46.setOnClickListener(this);
        butt47 = (Button) findViewById(R.id.button_28);
        butt47.setOnClickListener(this);
        butt48 = (Button) findViewById(R.id.black20);
        butt48.setOnClickListener(this);
        butt49 = (Button) findViewById(R.id.button_29);
        butt49.setOnClickListener(this);
        butt50 = (Button) findViewById(R.id.black21);
        butt50.setOnClickListener(this);
        butt51 = (Button) findViewById(R.id.button_30);
        butt51.setOnClickListener(this);
        butt52 = (Button) findViewById(R.id.button_31);
        butt52.setOnClickListener(this);
        butt53 = (Button) findViewById(R.id.black22);
        butt53.setOnClickListener(this);
        butt54 = (Button) findViewById(R.id.button_32);
        butt54.setOnClickListener(this);
        butt55 = (Button) findViewById(R.id.black23);
        butt55.setOnClickListener(this);
        butt56 = (Button) findViewById(R.id.button_33);
        butt56.setOnClickListener(this);
        butt57 = (Button) findViewById(R.id.button_34);
        butt57.setOnClickListener(this);
        butt58 = (Button) findViewById(R.id.black24);
        butt58.setOnClickListener(this);
        butt59 = (Button) findViewById(R.id.button_35);
        butt59.setOnClickListener(this);
        butt60 = (Button) findViewById(R.id.black25);
        butt60.setOnClickListener(this);
        butt61 = (Button) findViewById(R.id.button_36);
        butt61.setOnClickListener(this);
        butt62 = (Button) findViewById(R.id.black26);
        butt62.setOnClickListener(this);
        butt63 = (Button) findViewById(R.id.button_37);
        butt63.setOnClickListener(this);
        butt64 = (Button) findViewById(R.id.button_38);
        butt64.setOnClickListener(this);
        butt65 = (Button) findViewById(R.id.black27);
        butt65.setOnClickListener(this);
        butt66 = (Button) findViewById(R.id.button_39);
        butt66.setOnClickListener(this);
        butt67 = (Button) findViewById(R.id.black28);
        butt67.setOnClickListener(this);
        butt68 = (Button) findViewById(R.id.button_40);
        butt68.setOnClickListener(this);
        butt69 = (Button) findViewById(R.id.button_41);
        butt69.setOnClickListener(this);
        butt70 = (Button) findViewById(R.id.black29);
        butt70.setOnClickListener(this);
        butt71 = (Button) findViewById(R.id.button_42);
        butt71.setOnClickListener(this);
        butt72 = (Button) findViewById(R.id.black30);
        butt72.setOnClickListener(this);
        butt73 = (Button) findViewById(R.id.button_43);
        butt73.setOnClickListener(this);
        butt74 = (Button) findViewById(R.id.black31);
        butt74.setOnClickListener(this);
        butt75 = (Button) findViewById(R.id.button_44);
        butt75.setOnClickListener(this);
        butt76 = (Button) findViewById(R.id.button_45);
        butt76.setOnClickListener(this);
        butt77 = (Button) findViewById(R.id.black32);
        butt77.setOnClickListener(this);
        butt78 = (Button) findViewById(R.id.button_46);
        butt78.setOnClickListener(this);
        butt79 = (Button) findViewById(R.id.black33);
        butt79.setOnClickListener(this);
        butt80 = (Button) findViewById(R.id.button_47);
        butt80.setOnClickListener(this);
        butt81 = (Button) findViewById(R.id.button_48);
        butt81.setOnClickListener(this);
        butt82 = (Button) findViewById(R.id.black34);
        butt82.setOnClickListener(this);
        butt83 = (Button) findViewById(R.id.button_49);
        butt83.setOnClickListener(this);
        butt84 = (Button) findViewById(R.id.black35);
        butt84.setOnClickListener(this);
        butt85 = (Button) findViewById(R.id.button_50);
        butt85.setOnClickListener(this);
        butt86 = (Button) findViewById(R.id.black36);
        butt86.setOnClickListener(this);
        butt87 = (Button) findViewById(R.id.button_51);
        butt87.setOnClickListener(this);
        butt88 = (Button) findViewById(R.id.button_52);
        butt88.setOnClickListener(this);

    }

    /**
     * OnClickListener is an interface, so the onClick() method
     * needs to be overwritten.
     **/
    @Override
    public void onClick(View view) {

    }

    /**public void record(View view){

    }

    public void play(View view){

    }**/

    // Function used to switch to the testing activity preview.
    void testActivity(){

        Intent intent = new Intent(MainActivity.this, Test.class);
        startActivity(intent);

    }

}