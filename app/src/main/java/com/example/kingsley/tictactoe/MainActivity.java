package com.example.kingsley.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private boolean isNoughts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton cpuRadioButton = findViewById(R.id.cpu_radio);
        RadioButton friendRadioButton = findViewById(R.id.friend_radio);
        RadioButton grid3RadioButton = findViewById(R.id.grid3_radio);
        RadioButton grid5RadioButton = findViewById(R.id.grid5_radio);
        RadioButton crossRadioButton = findViewById(R.id.cross_radio);
        RadioButton nutsRadioButton = findViewById(R.id.nuts_radio);
        final Button playButton = findViewById(R.id.play_button);


        cpuRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playButton.setText(R.string.opponent_cpu);
            }
        });

        friendRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playButton.setText(R.string.opponent_human);
            }
        });

        grid3RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        grid5RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        crossRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNoughts = false;
            }
        });

        nutsRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNoughts = true;
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent3();
            }
        });
    }

    private void intent3() {
        Intent grid3Intent = new Intent(this, Grid3Activity.class);
        grid3Intent.putExtra("I am", isNoughts);
        startActivity(grid3Intent);
    }

}
