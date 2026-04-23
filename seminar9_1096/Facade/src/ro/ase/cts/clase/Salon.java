package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private boolean[] paturiLibere=new boolean[10];

    public Salon() {
        paturiLibere[1]=true;
        paturiLibere[2]=true;
        paturiLibere[3]=true;
        paturiLibere[4]=true;
    }

    public int getPatLiber(){
        for(int i=0;i<paturiLibere.length;i++){
            if(paturiLibere[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int poz){
        this.paturiLibere[poz]=false;
    }
}
