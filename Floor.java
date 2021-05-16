import java.util.ArrayList;

public class Floor {
    public ArrayList<Rack> racks;
    int floor;

    public Floor(int floor) {
        racks = new ArrayList<>();
        this.floor = floor;
    }

    public void addRack(Rack rack) {
        int flag = 0;
        for (Rack racks : racks) {
            if (racks.getENumero() == rack.getENumero()) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            this.racks.add(rack);
    }

    public int delSeccion(String[] seccion) {
        for (Rack rack : racks) {
            if (rack.getESeccion().equals(seccion[1]) && rack.getENumero() == Integer.valueOf(seccion[0])) {
                if (rack.getBooks() != null) {
                    return 1;
                }
                racks.remove(rack);
            }
        }
        return 0;
    }

    public String toString() {
        String string = "";
        string += "Piso: " + this.floor + "\n";
        return string;
    }

    public String pure_toString() {
        String string = "";
        string += this.floor + ",\"";
        return string;
    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Rack rack : racks) {
            book = rack.buscarTitulo(titulo);
            if (book != null)
                return book += this.toString();
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String book = "";
        for (Rack rack : racks) {
            book = rack.obtenerInfoCSV(titulo);
            if (book != null)
                return book += this.pure_toString();
        }
        return null;
    }

    public Book getBook(String titulo) {
        Book book;
        for (Rack rack : racks) {
            book = rack.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Rack> getRacks() {
        return this.racks;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRacks(ArrayList<Rack> racks) {
        this.racks = racks;
    }
}
