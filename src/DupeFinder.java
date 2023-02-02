import java.util.*;

public class DupeFinder<E> {

    private List<E> createdListofFruits;

    public DupeFinder(List<E> createdListofFruits) {
        this.createdListofFruits = createdListofFruits;
    }

    public int checkDupes() {
        Set<E> set = new HashSet<>(createdListofFruits);

        return createdListofFruits.size() - set.size();
    }

    public List<E> getDupes() {
        Set<E> set = new HashSet<>();
        List<E> listOfDuplicates = new ArrayList<>();

        for (E fruit : createdListofFruits) {
            boolean duplicated = !set.add(fruit);

            if (duplicated) {
                listOfDuplicates.add(fruit);
            }
        }

        return listOfDuplicates;
    }

    public Collection<E> sortedDupes(){


        return new TreeSet<>(getDupes());


    }

}
