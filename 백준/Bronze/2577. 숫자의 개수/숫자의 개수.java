import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[3];
        int total = 1;
        String test;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(bf.readLine());
            arr[i] = num;
            total = total * arr[i];
        }

        test = String.valueOf(total);

        for (int j = 0; j <= 9; j++) {
            String t = String.valueOf(j);
            if (test.length() == 1 && j == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(test.length() - test.replace(t, "").length());
            }

        }
    }
}
