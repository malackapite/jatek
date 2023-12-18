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
    public Szoba masikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikSzoveg() {
        return "tovább";
    }

    @Override
    public String masikSzoveg() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
