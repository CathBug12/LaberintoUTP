package com.example.laberinto;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Laberinto;
import model.LaberintoElement;

public class game extends AppCompatActivity {
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9,
    ib10, ib11, ib12, ib13, ib14, ib15, ib16, btn_inicio, b1;
    Laberinto laberinto;
    String name;
    TextView tv_nameg, tv_time;
    game context;
    SharedPreferences mPreferences;
    private static final long START_TIME_IN_MILLIS=20000;
    private CountDownTimer countDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private boolean mTimerRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tv_time = findViewById(R.id.tv_time);

        mPreferences = getSharedPreferences(MainActivity.sharedPrefFile, MODE_PRIVATE);
        context=this;
        name= getIntent().getStringExtra(MainActivity.KEY_NAME);
        tv_nameg = (TextView) findViewById(R.id.tv_nameg);
        tv_nameg.setText("Bienvenido " + name);
        initImages();
        initLaberinto();
        btn_inicio = (ImageButton) findViewById(R.id.btn_inicio);
        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isExternalStorageWritable()){
                    requestPermission();
                }
                if(mTimerRunning){
                    Toast.makeText(context,"", Toast.LENGTH_SHORT).show();

                } else{
                    startTimer();
                }
            }
        });
        
    }
    public void initLaberinto(){
        int n=4;
        List<LaberintoElement> listLaberintoElement = new ArrayList<>();
     //   for(int i=0 ; i< n*n; i++){
       //     listLaberintoElement.add(new LaberintoElement(i,i, ib, getResources().getDrawable(R.drawable.personaje)));
      //  }
        listLaberintoElement.add(new LaberintoElement(1,1, ib1, getResources().getDrawable(R.drawable.personaje), context));
        listLaberintoElement.add(new LaberintoElement(2,2, ib2, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(3,3, ib3, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(4,4, ib4, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(5,5, ib5, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(6,6, ib6, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(7,7, ib7, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(8,8, ib8, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(9,9, ib9, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(10,10, ib10, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(11,11, ib11, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(12,12, ib12, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(13,13, ib13, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(14,14, ib14, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(15,15, ib15, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(16,16, ib16, getResources().getDrawable(R.drawable.pink), context));

        laberinto = new Laberinto(n,1,listLaberintoElement);
        laberinto.loadImage();
    }

    public void initImages(){
        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);
        ib5 = (ImageButton) findViewById(R.id.ib5);
        ib6 = (ImageButton) findViewById(R.id.ib6);
        ib7 = (ImageButton) findViewById(R.id.ib7);
        ib8 = (ImageButton) findViewById(R.id.ib8);
        ib9 = (ImageButton) findViewById(R.id.ib9);
        ib10 = (ImageButton) findViewById(R.id.ib10);
        ib11 = (ImageButton) findViewById(R.id.ib11);
        ib12 = (ImageButton) findViewById(R.id.ib12);
        ib13 = (ImageButton) findViewById(R.id.ib13);
        ib14 = (ImageButton) findViewById(R.id.ib14);
        ib15 = (ImageButton) findViewById(R.id.ib15);
        ib16 = (ImageButton) findViewById(R.id.ib16);

    }

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    private void requestPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        } else {
            laberinto.saveImagesToExternal();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,  int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && permissions[0].equals(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                    // check whether storage permission granted or not.
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        laberinto.saveImagesToExternal();
                    }
                }
                break;
            default:
                break;
        }
    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public  void startTimer(){
        countDownTimer = new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long l) {
                mTimeLeftInMillis = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        mTimerRunning=true;
    }
    private  void updateCountDownText(){
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted= String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        tv_time.setText(timeLeftFormatted);
    }
}