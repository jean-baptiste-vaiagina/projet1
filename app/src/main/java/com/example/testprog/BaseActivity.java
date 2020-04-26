package com.example.testprog;



import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

abstract class BaseActivity extends AppCompatActivity {
    public void showBaseError(){
        //TODO Afficher Error;
        Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
    }
}
