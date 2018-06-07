package com.rv.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] dice = {R.drawable.dice1,
    R.drawable.dice2,
    R.drawable.dice3,
    R.drawable.dice4,
    R.drawable.dice5,
    R.drawable.dice6};

    ImageView dice1, dice2;
    Button rollbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        rollbtn = findViewById(R.id.roll_dice);


     }

    public void roll(View view) {

        Random random = new Random();
        Random random1 = new Random();

        int rNo = random.nextInt(6);
        int rNo1 = random1.nextInt(6);


        dice1.setImageResource(dice[rNo]);
        dice2.setImageResource(dice[rNo1]);
        
        if (rNo == rNo1) {

            Toast.makeText(this, "Yeahhhh.. ", Toast.LENGTH_SHORT).show();
        }


        Log.e("Button pressed","Randam no is -->"+rNo);
        Log.e("Button pressed","Randam no is -->"+rNo1);



    }
}
