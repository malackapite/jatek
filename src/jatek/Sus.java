package jatek;

public class Sus extends Szoba{
    @Override
    public String getNev() {
        return "Sus";
    }

    @Override
    public Szoba egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikSzoveg() {
        return "among";
    }
}
