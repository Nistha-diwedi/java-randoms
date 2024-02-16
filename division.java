public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        long quotient = 0;

        while (ldividend >= ldivisor) {
            long temp = ldivisor, multiple = 1;

            // Use bit manipulation to find the largest multiple of divisor
            while ((ldividend >> 1) >= temp) {
                temp <<= 1;
                multiple <<= 1;
            }

            ldividend -= temp;
            quotient += multiple;
        }

        return (int) (sign * quotient);
    }
}
