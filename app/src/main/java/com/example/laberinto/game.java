package com.example.laberinto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import model.Laberinto;
import model.LaberintoElement;

public class game extends AppCompatActivity {
    ImageButton ibOne, ivTwo, ibThree, ibFour, ibFive, ibSix, ibSeven, ibEigth, ibNine,
    ibTen, ibEleven, ibTwelve, ibThirteen, ibFourteen, ibFiveteen, ibSixteen, btn_inicio;
    Laberinto laberinto;
    String name;
    TextView tv_nameg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        name= getIntent().getStringExtra("name_g");
        tv_nameg = (TextView) findViewById(R.id.tv_nameg);
        tv_nameg.setText("Bienvenido " + name);

        
    }
    public void initLaberinto(){
        int n=4;
        List<LaberintoElement> listLaberintoElement = new ArrayList<>();
        listLaberintoElement.add(new LaberintoElement(ibOne,getResources().getDrawable()))
    }
}