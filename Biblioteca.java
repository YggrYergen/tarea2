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

    public void deleteBook(Biblioteca biblioteca, String titulo) {
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            if (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0).getBooks().get(0)
                    .getTitulo().equals(titulo)) {
                try {
                    biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0).getBooks()
                            .remove(0);
                } catch (IndexOutOfBoundsException e) {
                    // Hacer nada ._.
                }
            }
        }
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

    public int deleteSede(Biblioteca biblioteca, String nombre_sede) {
        int j = 1;
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            try {
                if (biblioteca.sedes.get(i).getSede().equals(nombre_sede)) {
                    if ((biblioteca.sedes.get(i).getEdificios().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks()
                                    .isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0)
                                    .getBooks().isEmpty() == true)) {
                        biblioteca.sedes.remove(i);
                        j = 0;
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return j;
    }
    
    public int deletePiso(Biblioteca biblioteca, String nombre_piso) {
        int j = 1;
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            try {
                if (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getFloor() == Integer.valueOf(nombre_piso))) {
                    if ((biblioteca.sedes.get(i).getEdificios().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks()
                                    .isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0)
                                    .getBooks().isEmpty() == true)) {
                        biblioteca.sedes.get(i).getEdificios().get(0).getFloors().remove(0);
                        j = 0;
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return j;
    }  

    public int deleteSecc(Biblioteca biblioteca, String nombre_secc) {
        int j = 1;
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            try {
                if (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0).getESeccion().equals(nombre_secc)) {
                    if ((biblioteca.sedes.get(i).getEdificios().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks()
                                    .isEmpty() == true)
                            || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0)
                                    .getBooks().isEmpty() == true)) {
                        System.out.println(biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().remove(0);
                        j = 0;
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return j;
    }          

    /*
     * public int delete(String[] seccion, int opcion) { int i = 0; // 0 = SEDE, 1 =
     * PISO, 2 = SECCION switch (opcion) { case 0: for (Sede sede : sedes) { if
     * (sede.getSede().equals(seccion[0])) { if (sede.getEdificios() != null) {
     * return 1; } this.sedes.remove(sede); } } return i; case 1: for (Sede sede :
     * sedes) { if (sede.getSede().equals(seccion[2])) { i = sede.delete(seccion,
     * opcion); } } return i; case 2: // if vacio for (Sede sede : sedes) { if
     * (sede.getSede().equals(seccion[4])) { i = sede.delete(seccion, opcion); } }
     * return i; } return i; }
     */

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

}
