package softuni.oop.inheritance;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random rnd;

    public RandomArrayList() {
        rnd = new Random();
    }

    public T getRandomElement() {
        int index = this.rnd.nextInt(this.size());

        return remove(index);
    }

    @Override
    public String toString() {
        return "RandomArrayList{" +
                "modCount=" + modCount +
                '}';
    }
}
