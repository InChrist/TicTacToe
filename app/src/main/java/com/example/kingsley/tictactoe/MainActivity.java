package com.example.kingsley.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private boolean isNoughts;
    private boolean isGrid3;
    private boolean vsCpu;

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
                vsCpu = true;
            }
        });

        friendRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vsCpu = false;
            }
        });

        grid3RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isGrid3 = true;
            }
        });

        grid5RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isGrid3 = false;
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
                selectIntent(isGrid3);
            }
        });
    }

    private void intent3() {
        Intent grid3Intent = new Intent(this, Grid3Activity.class);
        grid3Intent.putExtra("I am", isNoughts);
        startActivity(grid3Intent);
    }

    private void intent5() {
        Intent grid5Intent = new Intent(this, Grid5Activity.class);
        startActivity(grid5Intent);
    }

    private void selectIntent(boolean state) {
        if (state)
            intent3();
        else intent5();
    }

}
