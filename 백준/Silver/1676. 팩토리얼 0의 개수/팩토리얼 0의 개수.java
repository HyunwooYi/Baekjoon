import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    private static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        BigInteger result = factorial(num);
        int zero = 0;

        String str = result.toString();
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == '0') {
                zero++;
            } else {
                break;
            }
        }
        System.out.println(zero);
    }
}
