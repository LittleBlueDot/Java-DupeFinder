package Fruits;

import java.util.Objects;

public abstract class Fruit implements Comparable<Fruit>{

    private int acidity;

    public Fruit(int acidity) {
        this.acidity = acidity;
    }

    public int getAcidity() {
        return acidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return acidity == fruit.acidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acidity);
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + ", acidity = " + acidity;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.acidity - o.acidity;
    }

    //    @Override
//    public int compareTo(Fruit o) {
//        if (this.getAcidity() > o.getAcidity()){
//            return 1;
//        } else if(this.getAcidity() < o.getAcidity()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }



}
