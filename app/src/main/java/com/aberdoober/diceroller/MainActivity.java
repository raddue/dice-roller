package com.aberdoober.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button1d20 = (Button) findViewById(R.button1d20);
    final TextView text1d20 = (TextView) findViewById(R.id.button1d20results);
        button1d20.setOnClickListener(new View.OnClickListener()) {

    }

    public static int randomDiceValue() {
        return Random.nextInt(buttonvalue)+1;
    }

//        Button button1d20 = (Button) findViewById(R.id.button1d20);
//        final TextView text1d20 = (TextView) findViewById(R.id.button1d20results);
//        button1d20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int min = 1;
//                int max = 20;
//                int random = ThreadLocalRandom.current().nextInt(min,max+1);
//                text1d20.setText(new StringBuilder().append(random));
//            }
//
//        });
//
//        Button button2d20 = (Button) findViewById(R.id.button2d20);
//        final TextView text2d20 = (TextView) findViewById(R.id.button2d20results);
//        button1d20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int min = 1;
//                int max = 20;
//                int random = ThreadLocalRandom.current().nextInt(min,max+1);
//                text2d20.setText(new StringBuilder().append(random));
//            }
//
//        });
//
//        Button button1d12 = (Button) findViewById(R.id.button1d12);
//        final TextView text1d12 = (TextView) findViewById(R.id.button1d12results);
//        button1d12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int min = 1;
//                int max = 12;
//                int random = ThreadLocalRandom.current().nextInt(min,max+1);
//                text1d12.setText(new StringBuilder().append(random));
//            }
//
//        });

}
