package java_core_grom.mateAkademi.treni.forsobes;

import java.util.Arrays;

public class Exercise1 {
    public long brackets(int n) {

        long[] array = new long[n + 1]; // the number of cells for the future array
        System.out.println(Arrays.toString(array)); // (This is for me) verification

        array[0] = 1; // assigning the first default value (1) to cell zero
        for (int i = 1; i <= n; i++) { //Calculate array[i] for i = 1..n

            array[i] = 0;
            System.out.println(Arrays.toString(array));// verification
            for (int j = 0; j < i; j++) //Calculate array[j]
                array[i] += array[j] * array[i - 1 - j]; // finding the number of parentheses
        }

        return array[n];
    }

}
