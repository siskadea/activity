package com.example.lenovo.j2tugassiska;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setPaintFlags(textView9.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
    }
}
