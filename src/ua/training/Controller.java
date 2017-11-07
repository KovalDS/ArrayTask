package ua.training;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Dima on 30.10.2017.
 */
public class Controller {
    private static final int[] array = {1, 2, 3, 4, 1, 2, 5, 5, 9, 0, -1};
    private static final int number = 123;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startSearch() {
        ArrayList<Integer> indexes;

        View.print(View.ARRAY_PRINT + Arrays.toString(array));
        View.print(View.NUMBER_PRINT + number);

        indexes = model.findIndexes(array, number);

        if (indexes.isEmpty()) {
            View.print(View.NO_MATCH);
            return;
        }

        View.print(View.INDEXES_ARE);
        View.print(indexes);
    }
}
