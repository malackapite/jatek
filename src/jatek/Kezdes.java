package jatek;

public class Kezdes extends Szoba{

    @Override
    public String getNev() {
        return "kezdés";
    }

    @Override
    public Szoba egyikIrany() {
        return null;
    }

    @Override
    public Szoba masikIrany() {
        return null;
    }

    @Override
    public String egyikSzoveg() {
        return "balra";
    }

    @Override
    public String masikSzoveg() {
        return "jobra";
    }
    
}
