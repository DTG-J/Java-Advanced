package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kindergarten {
    //•	name: String
    //•	capacity: int
    //•	registry: List<Child>
    private String name;
    private  int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }
    //•	Method	 addChild(Child child) -
    // Adds a child to the registry if there is room for it and returns true.
    // If there is no room for another child, returns false.
    public boolean addChild(Child child){
        if (capacity > registry.size()) {
           this.registry.add(child);
            return true;
        }
        return false;
    }
    //•	Method removeChild(String firstName) -
    // removes a child by a given firstName.
    // If removal is successful, returns true, otherwise, returns false.
    public boolean removeChild(String firstName){
        Child child1 = this.registry.stream()
                .filter(child -> child.getFirstName()
                        .equals(firstName)).findFirst().get();
        if (registry.contains(child1)){
            registry.remove(child1);
            return true;
        }
        return false;
    }
    //   Решение на ДЕСИ: public boolean removeChild(String firstName) {
    //        for (Child child : this.registry) {
    //            if (child.getFirstName().equals(firstName)) {
    //                this.registry.remove(child);
    //                return true;
    //            }
    //        }
    //•	Getter getChildrenCount - Returns the number of all children registered.
    public int getChildrenCount (){
        return this.registry.size();
    }
    //•	Method getChild(String firstName) - Returns the child with the given first name.
    public Child getChild(String firstName){
        Child child1 = this.registry.stream().filter(child -> child.getFirstName()
                .equals(firstName)).findFirst().orElseThrow();
        return child1;
    }
    //Desi decision:
    //    public Child getChild(String firstName) {
    //        for (Child child : this.registry) {
    //            if (child.getFirstName().equals(firstName)) {
    //                return child;
    //            }
    //        }
    //        //няма такова дете
    //        return null;
}
