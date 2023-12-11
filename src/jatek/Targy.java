package jatek;

import java.util.Objects;
import java.util.UUID;

public class Targy {
    String nev, leiras;
    UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        return Objects.equals(this.nev, obj);
    }

    @Override
    public String toString() {
        return "Targy{" + "nev=" + nev + ", leiras=" + leiras + ", id=" + id + '}';
    }
}
