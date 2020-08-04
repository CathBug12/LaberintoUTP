package com.example.laberinto;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Laberinto;
import model.LaberintoElement;

public class intermedio extends AppCompatActivity {
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9,
            ib10, ib11, ib12, ib13, ib14, ib15, ib16, ib17, ib18, ib19, ib20,
            ib21, ib22, ib23, ib24, ib25, ib26, ib27, ib28, ib29,
            ib30, ib31, ib32, ib33, ib34, ib35, ib36,btn_inicio, b1;
    Laberinto laberinto;
    String name;
    TextView tv_nameg, tv_time;
    intermedio context;
    private static final long START_TIME_IN_MILLIS=20000;
    private CountDownTimer countDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private boolean mTimerRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedio);
        tv_time = findViewById(R.id.tv_time2);
        context=this;
        name= getIntent().getStringExtra("name_g");
        tv_nameg = (TextView) findViewById(R.id.tv_nameg);
       // tv_nameg.setText("Bienvenido " + name);
        initImages();
        initLaberinto();
        btn_inicio = (ImageButton) findViewById(R.id.btn_inicio2);
        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isExternalStorageWritable()){
                    requestPermission();
                }

            }
        });
    }
    public void initLaberinto(){
        int n=6;
        List<LaberintoElement> listLaberintoElement = new ArrayList<>();
        //   for(int i=0 ; i< n*n; i++){
        //     listLaberintoElement.add(new LaberintoElement(i,i, ib, getResources().getDrawable(R.drawable.personaje)));
        //  }
        listLaberintoElement.add(new LaberintoElement(1,1, ib1, getResources().getDrawable(R.drawable.personaje), context));
        listLaberintoElement.add(new LaberintoElement(2,2, ib2, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(3,3, ib3, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(4,4, ib4, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(5,5, ib5, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(6,6, ib6, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(7,7, ib7, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(8,8, ib8, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(9,9, ib9, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(10,10, ib10, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(11,11, ib11, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(12,12, ib12, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(13,13, ib13, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(14,14, ib14, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(15,15, ib15, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(16,16, ib16, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(17,17, ib17, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(18,18, ib18, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(19,19, ib19, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(20,20, ib20, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(21,21, ib21, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(22,22, ib22, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(23,23, ib23, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(24,24, ib24, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(25,25, ib25, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(26,26, ib26, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(27,27, ib27, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(28,28, ib28, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(29,29, ib29, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(30,30, ib30, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(31,31, ib31, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(32,32, ib32, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(33,33, ib33, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(34,34, ib34, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(35,35, ib35, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(36,36, ib36, getResources().getDrawable(R.drawable.yellow), context));


        laberinto = new Laberinto(n,1,listLaberintoElement);
        laberinto.loadImage();
    }

    public void initImages(){
        ib1 = (ImageButton) findViewById(R.id.ib21);
        ib2 = (ImageButton) findViewById(R.id.ib22);
        ib3 = (ImageButton) findViewById(R.id.ib23);
        ib4 = (ImageButton) findViewById(R.id.ib24);
        ib5 = (ImageButton) findViewById(R.id.ib25);
        ib6 = (ImageButton) findViewById(R.id.ib26);
        ib7 = (ImageButton) findViewById(R.id.ib27);
        ib8 = (ImageButton) findViewById(R.id.ib28);
        ib9 = (ImageButton) findViewById(R.id.ib29);
        ib10 = (ImageButton) findViewById(R.id.ib30);
        ib11 = (ImageButton) findViewById(R.id.ib31);
        ib12 = (ImageButton) findViewById(R.id.ib32);
        ib13 = (ImageButton) findViewById(R.id.ib33);
        ib14 = (ImageButton) findViewById(R.id.ib34);
        ib15 = (ImageButton) findViewById(R.id.ib35);
        ib16 = (ImageButton) findViewById(R.id.ib36);
        ib17 = (ImageButton) findViewById(R.id.ib37);
        ib18 = (ImageButton) findViewById(R.id.ib38);
        ib19 = (ImageButton) findViewById(R.id.ib39);
        ib20 = (ImageButton) findViewById(R.id.ib40);
        ib21 = (ImageButton) findViewById(R.id.ib41);
        ib22 = (ImageButton) findViewById(R.id.ib42);
        ib23 = (ImageButton) findViewById(R.id.ib43);
        ib24 = (ImageButton) findViewById(R.id.ib44);
        ib25 = (ImageButton) findViewById(R.id.ib45);
        ib26 = (ImageButton) findViewById(R.id.ib46);
        ib27 = (ImageButton) findViewById(R.id.ib47);
        ib28 = (ImageButton) findViewById(R.id.ib48);
        ib29 = (ImageButton) findViewById(R.id.ib49);
        ib30 = (ImageButton) findViewById(R.id.ib50);
        ib31= (ImageButton) findViewById(R.id.ib51);
        ib32 = (ImageButton) findViewById(R.id.ib52);
        ib33 = (ImageButton) findViewById(R.id.ib53);
        ib34 = (ImageButton) findViewById(R.id.ib54);
        ib35 = (ImageButton) findViewById(R.id.ib55);
        ib36 = (ImageButton) findViewById(R.id.ib56);


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
        countDownTimer = new CountDownTimer(mTimeLeftInMillis,2000) {
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