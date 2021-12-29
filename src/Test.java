import java.util.Arrays;

public class Test {
    public void test() {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] testArray2 = new int[11];
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > 5) {
                testArray2[i] = testArray[i];
            }
        }

        System.out.println(Arrays.toString(testArray2));
    }


}

