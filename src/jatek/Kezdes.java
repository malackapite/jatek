package jatek;

public class Kezdes extends Szoba implements MasikIrany{

    @Override
    public String getNev() {
        return "kezdés";
    }

    @Override
    public Szoba egyikIrany() {
        return new Sus();
    }

    @Override
    public Szoba masikIrany() {
        return new Sussy();
    }
    
    @Override
    public String egyikSzoveg() {
        return "balra";
    }

    @Override
    public String masikSzoveg() {
        return "jobbra";
    }
    
}
