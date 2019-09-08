package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Logging Example";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button)findViewById(R.id.btn);
        Log.d(TAG,"On True" );
        try {
            //
        } catch (Exception e) {
            Log.e(TAG, "Received an exception " + e.getMessage() );
        }

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();

            }
        });



        Button btn = (Button)findViewById(R.id.button5);
        Log.d(TAG,"On False" );
        try {
            //
        } catch (Exception e) {
            Log.e(TAG, "Received an exception " + e.getMessage() );
        }
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();

            }
        });
    }
}