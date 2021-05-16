import java.util.ArrayList;

public class Edificio {
    protected String edificio;
    public ArrayList<Floor> floors;

    public Edificio(String edificio) {
        floors = new ArrayList<>();
        this.edificio = edificio;
    }

    public void addFloor(Floor floor) {
        int flag = 0;
        for (Floor floors : floors) {
            if (floors.getFloor() == floor.getFloor()) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            this.floors.add(floor);
    }

    public Book getBook(String titulo) {
        Book book;
        for (Floor floor : floors) {
            book = floor.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public void deleteBook(Book book) {

    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Floor floor : floors) {
            book = floor.buscarTitulo(titulo);
            if (book != null)
                return book += this.toString();
        }
        return null;
    }

    public String getUbicacion(String titulo) {
        String info = "";
        for (Floor floor : floors) {
            info = floor.obtenerInfoCSV(titulo);
            if (info != null)
                return info += ", " + this.edificio;
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String book = "";
        for (Floor floor : floors) {
            book = floor.obtenerInfoCSV(titulo);
            if (book != null)
                return book += this.pure_toString();
        }
        return null;
    }

    public int delete(String[] seccion, int opcion) {
        int i = 0;
        // 0 = SEDE, 1= PISO, 2 = SECCION
        if (opcion == 0) {
            // if vacio
            for (Floor floor : floors) {
                i = floor.delete(seccion, opcion);
                if (i == 1)
                    return i;
            }
            return i;
        }
        if (opcion == 1) {
            // if vacio
            for (Floor floor : floors) {
                i = floor.delete(seccion, opcion);
                if (i == 0)
                    this.floors.remove(floor);
            }
            return i;
        }
        if (opcion == 2) {
            // if vacio
            for (Floor floor : floors) {
                if (floor.getFloor() == Integer.valueOf(seccion[2])) {
                    i = floor.delete(seccion, opcion);
                }

            }
            return i;
        }
        return i;
    }

    public String toString() {
        String string = "";
        string += "Edificio: " + this.edificio + "\n";
        return string;
    }

    public String pure_toString() {
        String string = "";
        string += this.edificio + "\",\"";
        return string;
    }

    // ################ Getter&Setters ##############################

    public String getEdificio() {
        return this.edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Floor> getFloors() {
        return this.floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }
}
