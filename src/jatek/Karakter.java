package jatek;

import java.util.Random;


public class Karakter {
    int eletero, ugyesseg, szerencse;
    Random rnd;
    
    public Karakter() {
        eletero= rnd.nextInt(1, 7)+rnd.nextInt(1, 7)+12;
        ugyesseg= rnd.nextInt(1, 7)+6;
        szerencse= rnd.nextInt(1, 7)+6;
    }
}
