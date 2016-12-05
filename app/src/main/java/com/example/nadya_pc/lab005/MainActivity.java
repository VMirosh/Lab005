package com.example.nadya_pc.lab005;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Avrora;
    TextView Barbara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Barbara = (TextView) findViewById(R.id.text);
        Avrora = (Button) findViewById(R.id.b002);

        Avrora.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Barbara.setText("Clicked!");
        Barbara.setBackgroundColor(Color.GREEN);
    }
}

