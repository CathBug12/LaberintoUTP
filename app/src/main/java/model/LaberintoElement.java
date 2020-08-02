package model;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

public class LaberintoElement {
    private String filename;
    private int pos_current, pos_correct;
    private ImageButton imageButton;
    private Drawable drawable;

    public LaberintoElement(String filename, int pos_current, int pos_correct, ImageButton imageButton, Drawable drawable) {
        this.filename = filename;
        this.pos_current = pos_current;
        this.pos_correct = pos_correct;
        this.imageButton = imageButton;
        this.drawable = drawable;
    }

    public LaberintoElement(int pos_current, int pos_correct, ImageButton imageButton, Drawable drawable) {
        this.pos_current = pos_current;
        this.pos_correct = pos_correct;
        this.imageButton = imageButton;
        this.drawable = drawable;
    }

    public LaberintoElement(String filename, int pos_current, int pos_correct) {
        this.filename = filename;
        this.pos_current = pos_current;
        this.pos_correct = pos_correct;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getPos_current() {
        return pos_current;
    }

    public void setPos_current(int pos_current) {
        this.pos_current = pos_current;
    }

    public int getPos_correct() {
        return pos_correct;
    }

    public void setPos_correct(int pos_correct) {
        this.pos_correct = pos_correct;
    }

    public ImageButton getImageButton() {
        return imageButton;
    }

    public void setImageButton(ImageButton imageButton) {
        this.imageButton = imageButton;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
