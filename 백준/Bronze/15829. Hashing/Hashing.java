import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> hmap = new HashMap<>();
        char ch = 'a';
        for (int i = 97, j = 1; j < 27; i++, j++) {
            hmap.put(ch, j);
            ch += 1;
        }

        int cnt = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        BigInteger result = BigInteger.valueOf(0);
        for (int k = 0; k < cnt; k++) {
            BigInteger a = BigInteger.valueOf(hmap.get(str.charAt(k)));
            BigInteger r = BigInteger.valueOf(31).pow(k);
            result = result.add(a.multiply(r));
        }
        System.out.println(result.mod(BigInteger.valueOf(1234567891)));
    }
}
