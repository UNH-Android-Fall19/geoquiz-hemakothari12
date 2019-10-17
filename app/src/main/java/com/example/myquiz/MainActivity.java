package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Logging Example";

    Button trueButton, falseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button)findViewById(R.id.falseButton);



        trueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                Log.d(TAG,"Clicked True Button" );
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                Log.d(TAG,"Clicked False Button" );
            }
        });
    }
}