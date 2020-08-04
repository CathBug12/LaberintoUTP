package com.example.laberinto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button bBegin;
    static String KEY_NAME = "NAME_PLAYER";
    static final String sharedPrefFile = "com.example.activity";
    SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPreferences = getSharedPreferences(sharedPrefFile,MODE_PRIVATE);
        String nname= mPreferences.getString(KEY_NAME,"");

        etName = (EditText) findViewById(R.id.et_name);
        bBegin = (Button) findViewById(R.id.btn_start);
        bBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(getApplicationContext(),game.class);
                next.putExtra(KEY_NAME,etName.getText().toString());
                startActivity(next);
            }
        });
    }
}