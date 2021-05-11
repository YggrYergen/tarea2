import java.util.ArrayList;
/* import java.util.Scanner; */

public class Shelves {
    public ArrayList<Shelve> shelves;

    public Shelves() {
        shelves = new ArrayList<>();
    }

    public void addShelve(Shelve shelve) {
        this.shelves.add(shelve);

    }

    public String toString() {
        String string = "";
        for (Shelve shelve : shelves) {
            string += shelve.toString();
        }
        return string;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Shelve> getShelves() {
        return this.shelves;
    }

    public void setShelves(ArrayList<Shelve> shelves) {
        this.shelves = shelves;
    }

    /*public void editShelves(Scanner input){
        System.out.println("Ingresar Libro a editar:");
        String titulo = "\"" + input.nextLine() + "\"";
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                System.out.println("Ingresar Sede a editar:");
                String nuevasede = input.nextLine();
                book.setShelves(nuevasede);
                break;
            }
            else
            System.out.println("No se encuentra el libro");
            break;
        }
    }*/
}