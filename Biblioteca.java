import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Sede> sedes;

    public Biblioteca() {
        sedes = new ArrayList<>();
    }

    public void addSede(Sede sede) {
        /*
         * int flag = 0; for (Sede sedes : sedes) { if
         * (sedes.getSede().equalsIgnoreCase(sede.getSede())) { flag++; break; } } if
         * (flag == 0)
         */
        this.sedes.add(sede);
    }

    public void addBook(String[] user_add) {
        Book new_book = new Book(user_add[0], user_add[1], Integer.valueOf(user_add[2]));
        Rack new_rack = new Rack(Integer.valueOf(user_add[3]), user_add[4]);
        Floor new_floor = new Floor(Integer.valueOf(user_add[5]));
        Edificio new_edificio = new Edificio(user_add[6]);
        Sede new_sede = new Sede(user_add[7]);

        this.addSede(new_sede);
        new_sede.addEdificio(new_edificio);
        new_edificio.addFloor(new_floor);
        new_floor.addRack(new_rack);
        new_rack.addBook(new_book);
    }

    public void removeSede(Sede sede) {
        this.sedes.remove(sede);
    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.buscarTitulo(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.obtenerInfoCSV(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public Book getBook(String titulo) {
        Book book;
        for (Sede sede : sedes) {
            book = sede.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public void addSeccion(Seccion[] seccion) {
        Seccion new_seccion = new Seccion(seccion[0], seccion[1]);
        // Buscar
        for (Floor floor : floors) {
            if (seccion[2] == floor) {
                new_edificio.addfloor(floor);
            }
        }

        new_floor.addRack(new_seccion);
        this.seccion.add(seccion);
    }

    public int delSeccion(Seccion seccion) {
        // if vacio
        for (Book book : books) {
            if (book != null) {
                return 0; // Error: hay libros aun
            }

        }
        this.seccion.remove(seccion);
    }

    public void addPiso(Floor floor) {
        Floor new_floor = new Floor(floor);
        // Buscar
        for (Edificio edificio : edificios) {
            if (seccion[2] == edificio) {
                new_sede.addEdificio(edificio);
            }
        }

        new_edificio.addFloor(new_floor);
        this.floor.add(floor);
    }

    public int delPiso(Floor floor) {
        // if vacio
        for (Book book : books) {
            if (book != null) {
                return 0; // Error: hay libros aun
            }

        }
        this.floor.remove(floor);
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

}
