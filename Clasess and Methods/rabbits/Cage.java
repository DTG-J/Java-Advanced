package rabbits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    //•	add(Rabbit rabbit) method - adds an entity to the data if there is room for it
    public void add(Rabbit rabbit){
        if (capacity > this.data.size()){
            this.data.add(rabbit);
        }
    }
    //•	removeRabbit(String name) method - removes a rabbit by given name, if such exists, and returns boolean
    public boolean removeRabbit(String name){
        Rabbit rabbit = this.data.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst().orElse(null);
        if (rabbit.isAvailable()) {
            return this.data.remove(rabbit);
        }
        return false;
    }
    //•	removeSpecies(String species) method - removes all rabbits by given species
    public void removeSpecies(String species){
        /*List<Rabbit> rabbitSpecies = this.data.stream()
                .filter(rabbit -> rabbit.getSpecies()
                .equals(species)).toList();
      rabbitSpecies.forEach(r -> this.data.remove(r));*/
        this.data.removeIf(rabbit -> rabbit.getSpecies().equals(species));
    }
    //•	sellRabbit(String name) method - sell (set its available property to
    // false without removing it from the collection)
    // the first rabbit with the given name, also return the rabbit
    public Rabbit sellRabbit(String name){
        Rabbit rabbit = this.data.stream().filter(r -> r.getName().equals(name)).findFirst().orElseThrow();
        rabbit.setAvailable(false);
        return rabbit;
    }
}
