package model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.laberinto.game;

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

    public LaberintoElement(int pos_current, int pos_correct, ImageButton imageButton, Drawable drawable, final game context) {
        this.pos_current = pos_current;
        this.pos_correct = pos_correct;
        this.imageButton = imageButton;
        this.drawable = drawable;
        clickListener(context);
    }

    public LaberintoElement(String filename, int pos_current, int pos_correct) {
        this.filename = filename;
        this.pos_current = pos_current;
        this.pos_correct = pos_correct;
    }

    public void clickListener(final game context){
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Position " + pos_correct, Toast.LENGTH_SHORT).show();

                int pos_empty = context.getLaberinto().getPos_empty();
                if(pos_empty != pos_correct){
                    Drawable drawableDst = context.getLaberinto().getListLaberintoElement().get(pos_current-1).getDrawable();
                    Drawable drawableSrc =context.getLaberinto().getListLaberintoElement().get(0).getDrawable();

                    context.getLaberinto().getListLaberintoElement().get(pos_correct-1).getImageButton().setBackground(drawableSrc);
                    context.getLaberinto().getListLaberintoElement().get(pos_empty-1).getImageButton().setBackground(drawableDst);


                    context.getLaberinto().getListLaberintoElement().get(pos_empty-1).setPos_current(pos_current);
                    context.getLaberinto().getListLaberintoElement().get(pos_correct-1).setPos_current(pos_empty);

                    //   pos_current=pos_empty;
                    context.getLaberinto().setPos_empty(pos_correct);
                }
            }
        });
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
