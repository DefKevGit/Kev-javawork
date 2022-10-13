package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FavouriteNumbers {
    public static void main(String[] args) {
        List<Integer> faveNums = new ArrayList<>();

        faveNums.add(10);
        faveNums.add(1355417);
        faveNums.add(63);

        Collections.sort(faveNums, Collections.reverseOrder());

        for (int i : faveNums) {
            System.out.println(i);
        }
    }
}