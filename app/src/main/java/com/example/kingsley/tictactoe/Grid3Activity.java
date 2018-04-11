package com.example.kingsley.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grid3Activity extends AppCompatActivity {

    private final Button[] buttons = new Button[9];
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid3);


        buttons[0] = findViewById(R.id.button1);
        buttons[1] = findViewById(R.id.button2);
        buttons[2] = findViewById(R.id.button3);
        buttons[3] = findViewById(R.id.button4);
        buttons[4] = findViewById(R.id.button5);
        buttons[5] = findViewById(R.id.button6);
        buttons[6] = findViewById(R.id.button7);
        buttons[7] = findViewById(R.id.button8);
        buttons[8] = findViewById(R.id.button9);

        randomNumber = (int) (Math.random() * 9);

        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[0]);
            }
        });

        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[1]);
            }
        });

        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[2]);
            }
        });

        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[3]);
            }
        });

        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[4]);
            }
        });

        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[5]);
            }
        });

        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[6]);
            }
        });

        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpuPlay(buttons[randomNumber]);
                userPlay(buttons[7]);
            }
        });

        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPlay(buttons[8]);
                cpuPlay(buttons[randomNumber]);
            }
        });

    }

    /**
     * Generates a random number for the CPU play
     *
     * @param view the button generated
     */
    private void cpuPlay(View view) {
        randomNumber = (int) (Math.random() * 9);
        if (!view.isEnabled()) {
            for (int i = 0; !buttons[i].isEnabled(); i++) {

                if (i > buttons.length) return;
            }
        } else {
            if (!getIntent().getBooleanExtra("I am", true)) {
                view.setBackgroundResource(R.drawable.nought);
            } else view.setBackgroundResource(R.drawable.cross);
            view.setEnabled(false);
        }
    }

    private void userPlay(View view) {
        if (getIntent().getBooleanExtra("I am", true)) {
            view.setBackgroundResource(R.drawable.nought);
        } else view.setBackgroundResource(R.drawable.cross);
    }

    public void restart(View view) {
    }
}
