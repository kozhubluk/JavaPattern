package Task1;

import java.util.Arrays;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        int numbers[] = {0, 1, 3, 4, 1, 0, 6, 9};
        int test[] = {1, 1, 3};

        Function<int[], Integer> minValue = arr -> {
            int sorted [] = arr.clone();
            Arrays.sort(sorted);
            int ans = sorted[0];
            for (int i : sorted) {
                if (ans == 0) ans += i * 10;
                else if (ans % 10 == 0 && ans / 10 != i || ans % 10 != 0 && i != ans % 10) ans = ans * 10 + i;
            }
            return ans;
        };
        System.out.println(minValue.apply(numbers));
        System.out.println(minValue.apply(test));
    }
}
