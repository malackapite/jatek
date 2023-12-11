package jatek;

import java.util.ArrayList;
import java.util.Random;


public class Karakter {
    Random rnd;
    int eletero, ugyesseg, szerencse;
    ArrayList<Targy> felszereles;
    
    public Karakter() {
        rnd= new Random();
        felszereles= new ArrayList<>();
        eletero= rnd.nextInt(1, 7)+rnd.nextInt(1, 7)+12;
        ugyesseg= rnd.nextInt(1, 7)+6;
        szerencse= rnd.nextInt(1, 7)+6;
    }
    
    public void felvesz(Targy targy){
        felszereles.add(targy);
    }
    
    public void felvesz(Targy targy, int db){
        for (int ix = 0; ix < db; ix++)
            felvesz(targy);
    }
    
    public ArrayList hasznal(String nev){
        return hasznal(nev, 1);
    }
    
    public ArrayList hasznal(String nev, int db){
        return hasznal(nev, db, true);
    }
    
    public ArrayList hasznal(String nev, int db, boolean kellMind){
        int cnt=0, ix=0;
        ArrayList<Targy> tmp = new ArrayList();
        while(ix<felszereles.size() && cnt < db){
            if(felszereles.get(ix).equals(nev)){    
                tmp.add(felszereles.get(ix));
                felszereles.remove(ix);
                cnt++;
            }
            else
                ix++;
        }
        if(kellMind && cnt == db || !kellMind)
            return tmp;
        felszereles.addAll(tmp);
        return new ArrayList();
    } 
}
