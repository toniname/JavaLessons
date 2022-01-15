package java_core_grom.mateAkademi.treni.forsobes.Exercise3;
/*Find the sum of the digits in the number 100! (i.e. 100 factorial)
        {Correct answer: 648}*/
import java.math.BigInteger;

public class Sum {
    public void sumOfTheDigits(int digit) {

        BigInteger value = BigInteger.ONE; // declaring a large number and assigning a constant 1
        for (int i = 1; i <= digit; i++) { //iteration  over a given (digit) number of cells
            value = value.multiply(BigInteger.valueOf(i)); // multiplication of one and selected values from above
        }
        long sum = 0;

        while (value.compareTo(BigInteger.ZERO) > 0) {  // zero check
            value = value.divide(BigInteger.TEN); // Returns and assigns  value the result of division (this / val).
            //System.out.println(value);
            sum += value.mod(BigInteger.TEN).longValue(); // sum non-negative and converts this BigInteger to a long.

        }
        System.out.println(sum);
    }


}
