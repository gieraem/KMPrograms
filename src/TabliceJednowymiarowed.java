import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TabliceJednowymiarowed {
    int min = 10;
    int max = 50;

    int randomWithRange(int min, int max) {

        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    int[] array = new int[randomWithRange(min, max)];

    public void screening() {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomWithRange(min, max);

        }
        System.out.println(Arrays.toString(array));

    }
}
