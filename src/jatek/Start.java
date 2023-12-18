package jatek;

public class Start extends Szoba{

    @Override
    public String getNev() {
        return "start";
    }

    @Override
    public Szoba egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikSzoveg() {
        return "tovább";
    }
    
}
