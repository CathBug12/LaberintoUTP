package model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Laberinto {
    private int pos_current, n;
    private enum OPERATION{UP, DOWN, RIGHT, LEFT};
    private List<LaberintoElement> ListLaberintoElement;
    private FileOutputStream outputStream;
    private int pos_empty;

    public Laberinto(int pos_current, int n, List<LaberintoElement> listLaberintoElement) {
        this.pos_current = pos_current;
        this.n = n;
        ListLaberintoElement = listLaberintoElement;
        this.pos_empty=1;
    }

    public int getPos_current() {
        return pos_current;
    }

    public void setPos_current(int pos_current) {
        this.pos_current = pos_current;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<LaberintoElement> getListLaberintoElement() {
        return ListLaberintoElement;
    }

    public void setListLaberintoElement(List<LaberintoElement> listLaberintoElement) {
        ListLaberintoElement = listLaberintoElement;
    }

    public int getPos_empty() {
        return pos_empty;
    }

    public void setPos_empty(int pos_empty) {
        this.pos_empty = pos_empty;
    }

    /*Seteando imagenes*/
    public void SetImage(){
        List<Integer> ListPosCurrent = new ArrayList<>();
        List<Integer> ListPosCurrentFinal = new ArrayList<>();
        for(int i=0; i<n*n ; i++){
            if(i != 6){
                ListPosCurrent.add(i);
            }
        }

    /*    int index=0;
        for(int i=0; i<n*n; i++){
            if(i!=0){
                int value = ListPosCurrent.get(index);
                ListPosCurrentFinal.add(value);
                index++;
            } else{
                ListPosCurrentFinal.add(0);
            }
        }

        for(int i=0; i<ListLaberintoElement.size();i++){
            int newPos = ListPosCurrent.get(i);
            Drawable drawable = ListLaberintoElement.get(newPos).getDrawable();
            ListLaberintoElement.get(i).getImageButton().getBackground(drawable);
        }
        */
    }
    public void loadImage(){
        for(int i=0; i<ListLaberintoElement.size();i++){
            ListLaberintoElement.get(i).getImageButton().setBackground(ListLaberintoElement.get(i).getDrawable());
        }
    }

    public void saveImagesToExternal(){
        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        for(int i=0; i<ListLaberintoElement.size();i++){
            BitmapDrawable bitmapDrawable = (BitmapDrawable) ListLaberintoElement.get(i).getDrawable();
            Bitmap bitmap = bitmapDrawable.getBitmap();
            File file = new File(path, System.currentTimeMillis()+"LaberintoElement.jpg");
            try{
                outputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
                try{
                    outputStream.flush();
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
    }
}
