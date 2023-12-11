package jatek;

import java.util.ArrayList;
import java.util.Random;


public class Karakter {
    Random rnd;
    int eletero, ugyesseg, szerencse;
    ArrayList<Targy> felszereles;
    
    public Karakter() {
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
}
