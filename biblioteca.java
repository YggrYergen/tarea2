import java.util.ArrayList;

public class biblioteca {
    public ArrayList<Sede> sedes;

    public biblioteca() {

    }

    public void addSede(Sede sede) {
        this.sedes.add(sede);
    }

    public void removeSede(Sede sede) {
        this.sedes.remove(sede);
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }
}
