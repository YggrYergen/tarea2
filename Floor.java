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

    public Book getBook(String titulo) {
        Book book;
        for (Rack rack : racks) {
            book = rack.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
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

    public String getUbicacion(String titulo) {
        String info = "";
        for (Rack rack : racks) {
            info = rack.obtenerInfoCSV(titulo);
            if (info != null)
                return info += ", " + this.floor;
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

    public int delete(String[] seccion, int opcion) {
        for (Rack rack : racks) {
            if (rack.getESeccion().equals(seccion[1]) && rack.getENumero() == Integer.valueOf(seccion[0])) {
                if (rack.getBooks() != null) {
                    return 1;
                }
                this.racks.remove(rack);
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

    // ################ Getter&Setters ##############################

    public ArrayList<Rack> getRacks() {
        return this.racks;
    }

    public int getFloor() {
        return this.floor;
    }

    public String getFloorString() {
        String string = "";
        return string += this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRacks(ArrayList<Rack> racks) {
        this.racks = racks;
    }
}
