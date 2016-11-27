package com.example.ibas.namaaplikasi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton formButton,calculatorButton;
    Button likeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formButton = (ImageButton) findViewById(R.id.btn_form);
        calculatorButton = (ImageButton) findViewById(R.id.btn_calculator);
        likeButton = (Button) findViewById(R.id.btn_like);

        getSupportActionBar().setTitle("Home");
        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Halloo form !", Toast.LENGTH_SHORT).show();
                Intent keForm = new Intent(MainActivity.this,formActivity.class);
                startActivity(keForm);
            }
        });

        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ini Calculator", Toast.LENGTH_SHORT).show();
            }
        });

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You like this app !", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
