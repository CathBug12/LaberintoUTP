package model;

import java.util.ArrayList;
import java.util.List;

public class Laberinto {
    private int pos_current, n;
    private enum OPERATION{UP, DOWN, RIGHT, LEFT};
    private List<LaberintoElement> ListLaberintoElement;

    public Laberinto(int pos_current, int n, List<LaberintoElement> listLaberintoElement) {
        this.pos_current = pos_current;
        this.n = n;
        ListLaberintoElement = listLaberintoElement;
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
}
