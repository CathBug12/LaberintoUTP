package com.example.laberinto;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import model.Laberinto;
import model.LaberintoElement;

public class avanzado extends AppCompatActivity {

    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9,
            ib10, ib11, ib12, ib13, ib14, ib15, ib16, ib17, ib18, ib19, ib20,
            ib21, ib22, ib23, ib24, ib25, ib26, ib27, ib28, ib29,
            ib30, ib31, ib32, ib33, ib34, ib35, ib36, ib37,ib38,ib39,ib40,ib41,
            ib42,ib43,ib44,ib45,ib46,ib47,ib48,ib49,ib50,ib51, ib52,ib53,ib54,ib55,ib56,
            ib57,ib58,ib59,ib60,ib61,ib62,ib63,ib64,btn_inicio, b1;
    Laberinto laberinto;
    String name;
    TextView tv_nameg;
    avanzado context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanzado);
        context=this;
        name= getIntent().getStringExtra("name_g");
        tv_nameg = (TextView) findViewById(R.id.tv_nameg);
        // tv_nameg.setText("Bienvenido " + name);
        initImages();
        initLaberinto();
        btn_inicio = (ImageButton) findViewById(R.id.btn_inicio3);
        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isExternalStorageWritable()){
                    requestPermission();
                }
                Toast.makeText(context,"Ganaste", Toast.LENGTH_LONG).show();
            }
        });

    }
    public void initLaberinto(){
        int n=8;
        List<LaberintoElement> listLaberintoElement = new ArrayList<>();
        //   for(int i=0 ; i< n*n; i++){
        //     listLaberintoElement.add(new LaberintoElement(i,i, ib, getResources().getDrawable(R.drawable.personaje)));
        //  }
        listLaberintoElement.add(new LaberintoElement(1,1, ib1, getResources().getDrawable(R.drawable.personaje), context));
        listLaberintoElement.add(new LaberintoElement(2,2, ib2, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(3,3, ib3, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(4,4, ib4, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(5,5, ib5, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(6,6, ib6, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(7,7, ib7, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(8,8, ib8, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(9,9, ib9, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(10,10, ib10, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(11,11, ib11, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(12,12, ib12, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(13,13, ib13, getResources().getDrawable(R.drawable.dogui), context));//
        listLaberintoElement.add(new LaberintoElement(14,14, ib14, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(15,15, ib15, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(16,16, ib16, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(17,17, ib17, getResources().getDrawable(R.drawable.dogui), context));//
        listLaberintoElement.add(new LaberintoElement(18,18, ib18, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(19,19, ib19, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(20,20, ib20, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(21,21, ib21, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(22,22, ib22, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(23,23, ib23, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(24,24, ib24, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(25,25, ib25, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(26,26, ib26, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(27,27, ib27, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(28,28, ib28, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(29,29, ib29, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(30,30, ib30, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(31,31, ib31, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(32,32, ib32, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(33,33, ib33, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(34,34, ib34, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(35,35, ib35, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(36,36, ib36, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(37,37, ib37, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(38,38, ib38, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(39,39, ib39, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(40,40, ib40, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(41,41, ib41, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(42,42, ib42, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(43,43, ib43, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(44,44, ib44, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(45,45, ib45, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(46,46, ib46, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(47,47, ib47, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(48,48, ib48, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(49,49, ib49, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(50,50, ib50, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(51,51, ib51, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(52,52, ib52, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(53,53, ib53, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(54,54, ib54, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(55,55, ib55, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(56,56, ib56, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(57,57, ib57, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(58,58, ib58, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(59,59, ib59, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(60,60, ib60, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(61,61, ib61, getResources().getDrawable(R.drawable.yellow), context));
        listLaberintoElement.add(new LaberintoElement(62,62, ib62, getResources().getDrawable(R.drawable.pink), context));
        listLaberintoElement.add(new LaberintoElement(63,63, ib63, getResources().getDrawable(R.drawable.dogui), context));
        listLaberintoElement.add(new LaberintoElement(64,64, ib64, getResources().getDrawable(R.drawable.pink), context));


        laberinto = new Laberinto(n,1,listLaberintoElement);
        laberinto.loadImage();
    }

    public void initImages(){
        ib1 = (ImageButton) findViewById(R.id.ib60);
        ib2 = (ImageButton) findViewById(R.id.ib61);
        ib3 = (ImageButton) findViewById(R.id.ib62);
        ib4 = (ImageButton) findViewById(R.id.ib63);
        ib5 = (ImageButton) findViewById(R.id.ib64);
        ib6 = (ImageButton) findViewById(R.id.ib65);
        ib7 = (ImageButton) findViewById(R.id.ib66);
        ib8 = (ImageButton) findViewById(R.id.ib67);
        ib9 = (ImageButton) findViewById(R.id.ib68);
        ib10 = (ImageButton) findViewById(R.id.ib69);
        ib11 = (ImageButton) findViewById(R.id.ib70);
        ib12 = (ImageButton) findViewById(R.id.ib71);
        ib13 = (ImageButton) findViewById(R.id.ib72);
        ib14 = (ImageButton) findViewById(R.id.ib73);
        ib15 = (ImageButton) findViewById(R.id.ib74);
        ib16 = (ImageButton) findViewById(R.id.ib75);
        ib17 = (ImageButton) findViewById(R.id.ib76);
        ib18 = (ImageButton) findViewById(R.id.ib77);
        ib19 = (ImageButton) findViewById(R.id.ib78);
        ib20 = (ImageButton) findViewById(R.id.ib79);
        ib21 = (ImageButton) findViewById(R.id.ib80);
        ib22 = (ImageButton) findViewById(R.id.ib81);
        ib23 = (ImageButton) findViewById(R.id.ib82);
        ib24 = (ImageButton) findViewById(R.id.ib83);
        ib25 = (ImageButton) findViewById(R.id.ib84);
        ib26 = (ImageButton) findViewById(R.id.ib85);
        ib27 = (ImageButton) findViewById(R.id.ib86);
        ib28 = (ImageButton) findViewById(R.id.ib87);
        ib29 = (ImageButton) findViewById(R.id.ib88);
        ib30 = (ImageButton) findViewById(R.id.ib89);
        ib31= (ImageButton) findViewById(R.id.ib90);
        ib32 = (ImageButton) findViewById(R.id.ib91);
        ib33 = (ImageButton) findViewById(R.id.ib92);
        ib34 = (ImageButton) findViewById(R.id.ib93);
        ib35 = (ImageButton) findViewById(R.id.ib94);
        ib36 = (ImageButton) findViewById(R.id.ib95);
        ib37 = (ImageButton) findViewById(R.id.ib96);
        ib38 = (ImageButton) findViewById(R.id.ib97);
        ib39 = (ImageButton) findViewById(R.id.ib98);
        ib40 = (ImageButton) findViewById(R.id.ib99);
        ib41 = (ImageButton) findViewById(R.id.ib100);
        ib42 = (ImageButton) findViewById(R.id.ib101);
        ib43 = (ImageButton) findViewById(R.id.ib102);
        ib44 = (ImageButton) findViewById(R.id.ib103);
        ib45 = (ImageButton) findViewById(R.id.ib104);
        ib46 = (ImageButton) findViewById(R.id.ib105);
        ib47 = (ImageButton) findViewById(R.id.ib106);
        ib48 = (ImageButton) findViewById(R.id.ib107);
        ib49 = (ImageButton) findViewById(R.id.ib108);
        ib50 = (ImageButton) findViewById(R.id.ib109);
        ib51 = (ImageButton) findViewById(R.id.ib110);
        ib52 = (ImageButton) findViewById(R.id.ib111);
        ib53 = (ImageButton) findViewById(R.id.ib112);
        ib54 = (ImageButton) findViewById(R.id.ib113);
        ib55 = (ImageButton) findViewById(R.id.ib114);
        ib56 = (ImageButton) findViewById(R.id.ib115);
        ib57 = (ImageButton) findViewById(R.id.ib116);
        ib58 = (ImageButton) findViewById(R.id.ib117);
        ib59 = (ImageButton) findViewById(R.id.ib118);
        ib60 = (ImageButton) findViewById(R.id.ib119);
        ib61 = (ImageButton) findViewById(R.id.ib120);
        ib62 = (ImageButton) findViewById(R.id.ib121);
        ib63 = (ImageButton) findViewById(R.id.ib122);
        ib64 = (ImageButton) findViewById(R.id.ib123);


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
}