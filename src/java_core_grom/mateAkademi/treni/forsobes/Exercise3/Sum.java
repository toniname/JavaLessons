package java_core_grom.mateAkademi.treni.forsobes.Exercise3;

import java.math.BigInteger;

public class Sum {
    public long sumOfTheDigits(int digit) {

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= digit; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        long sum = 0;
        while (fact.compareTo(BigInteger.ZERO) > 0) {
             sum += fact.mod(BigInteger.TEN).longValue();
            fact = fact.divide(BigInteger.TEN);
        }
        return sum;
    }


}
