package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void buttonIsClicked(View buttonView) {
        //int result = 35;
        //Log.i("OPERATION","this" R.id.textF1);

        //Prints the text by a text ID
        TextView text = findViewById(R.id.textF1);
        Log.i("Tag", text.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
