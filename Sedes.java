import java.util.ArrayList;

public class Sedes {
    public ArrayList<Sede> sedes;

    public Sedes() {
        sedes = new ArrayList<>();
    }

    public void addSede(Sede sede) {
        this.sedes.add(sede);

    }

    public String toString() {
        String string = "";
        for (Sede sede : sedes) {
            string += sede.toString();
        }
        return string;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

}