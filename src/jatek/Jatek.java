package jatek;

public class Jatek {

    public static void main(String[] args) {
        teszt();
    }

    private static void teszt() {
        Karakter karakter = new Karakter();
        karakter.felvesz(new Targy("sus", "amongus"));
        karakter.felvesz(new Targy("sus2", "amongus 2"));
        karakter.felvesz(new Targy("sus", "amongus 4"));
        karakter.felvesz(new Targy("sus", "amongus 3"));
        System.out.println(karakter.hasznal("sus",2,false));
        System.out.println(karakter.hasznal("sus",2,false));
    }
    
}
