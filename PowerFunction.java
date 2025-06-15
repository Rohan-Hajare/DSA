package DSA;

public class PowerFunction {

    public static void main(String[] args) {

        System.out.println(power(2,-2));

    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return power(base * base, exponent / 2);
        } else {
            return base * power(base * base, (exponent - 1) / 2);
        }
    }
}
