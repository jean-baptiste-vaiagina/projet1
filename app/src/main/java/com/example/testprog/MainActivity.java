package com.example.testprog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends BaseActivity implements MainInterface {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainEntrer = findViewById(R.id.bottom);
        mainEntrer.setBackgroundColor(android.R.color.holo_green_light);
        mainEntrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "C'est partie!!!!", Toast.LENGTH_LONG).show();
            }
        });

        Button mainSortie = findViewById(R.id.bottom);
        mainSortie.setBackgroundColor(android.R.color.holo_red_light);
        mainSortie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Au Revoir", Toast.LENGTH_LONG).show();
            }
        });

        Button mainButton = findViewById(R.id.bottom);
        mainButton.setBackgroundColor(android.R.color.holo_orange_light);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"OnClicked", Toast.LENGTH_LONG).show();
            }
        });
       Chose chose = new Chose(  "toto" ,  2 );
       showBaseError();
    }

    @Override
    public void showList(List<Chose> List) {
        //TODO Faire le vrai code;

    }

    @Override
    public void showLoader() {

    }

    @Override
    public void showError() {

    }
}