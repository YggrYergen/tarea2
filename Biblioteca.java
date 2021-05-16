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

    public void deleteBook(Book book) {

    }

    public void moveBook(String[] address, Book book) {
        Rack new_rack = new Rack(Integer.valueOf(address[0]), address[1]);
        Floor new_floor = new Floor(Integer.valueOf(address[2]));
        Edificio new_edificio = new Edificio(address[3]);
        Sede new_sede = new Sede(address[4]);

        this.addSede(new_sede);
        new_sede.addEdificio(new_edificio);
        new_edificio.addFloor(new_floor);
        new_floor.addRack(new_rack);
        new_rack.addBook(book);

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

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.buscarTitulo(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public String getUbicacion(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.getUbicacion(titulo);
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

    public void addSeccion(String[] seccion) {
        Rack new_rack = new Rack(Integer.valueOf(seccion[0]), seccion[1]);
        Floor new_floor = new Floor(Integer.valueOf(seccion[2]));
        Edificio new_edificio = new Edificio(seccion[3]);
        Sede new_sede = new Sede(seccion[4]);

        this.addSede(new_sede);
        new_sede.addEdificio(new_edificio);
        new_edificio.addFloor(new_floor);
        new_floor.addRack(new_rack);
    }

    public void addPiso(String[] piso) {
        Floor new_floor = new Floor(Integer.valueOf(piso[0]));
        Edificio new_edificio = new Edificio(piso[1]);
        Sede new_sede = new Sede(piso[2]);

        this.addSede(new_sede);
        new_sede.addEdificio(new_edificio);
        new_edificio.addFloor(new_floor);
    }

    public int delete(String[] seccion, int opcion) {
        int i = 0;
        // 0 = SEDE, 1 = PISO, 2 = SECCION
        if (opcion == 0) {
            // if vacio
            for (Sede sede : sedes) {
                if (sede.getSede().equals(seccion[0])) {
                    i = sede.delete(seccion, opcion);
                }
                if (i == 0) {
                    this.sedes.remove(sede);
                }
            }
            return i;
        }
        if (opcion == 1) {
            // if vacio
            for (Sede sede : sedes) {
                if (sede.getSede().equals(seccion[2])) {
                    i = sede.delete(seccion, opcion);
                }
            }
            return i;
        }
        if (opcion == 2) {
            // if vacio
            for (Sede sede : sedes) {
                if (sede.getSede().equals(seccion[4])) {
                    i = sede.delete(seccion, opcion);
                }
            }
            return i;
        }
        return i;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

}
