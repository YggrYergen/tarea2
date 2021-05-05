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

}