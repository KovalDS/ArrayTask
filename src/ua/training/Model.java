package ua.training;

import java.util.ArrayList;

/**
 * Created by Dima on 30.10.2017.
 */
public class Model {
    public ArrayList<Integer> findIndexes(int[] array, int number) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
