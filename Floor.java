import java.util.ArrayList;

public class Floor {
    public ArrayList<Rack> racks;

    public Floor() {
        racks = new ArrayList<>();
    }

    public void addShelve(Rack rack) {
        this.racks.add(rack);

    }

    public String toString() {
        String string = "";
        for (Rack shelve : racks) {
            string += shelve.toString();
        }
        return string;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Rack> getRacks() {
        return this.racks;
    }

    public void setShelves(ArrayList<Rack> racks) {
        this.racks = racks;
    }

}
