package com.example.android.printmenutologs;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View v) {
        TextView v1 = (TextView) findViewById(R.id.item1);
        TextView v2 = (TextView) findViewById(R.id.item2);
        TextView v3 = (TextView) findViewById(R.id.item3);

        String t1 = (String) v1.getText();
        String t2 = (String) v2.getText();
        String t3 = (String) v3.getText();

        Log.i("MainActivity.java", t1);
        Log.i("MainActivity.java", t2);
        Log.i("MainActivity.java", t3);



    }
}
