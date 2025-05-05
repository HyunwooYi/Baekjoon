import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = br.readLine();
        }

        int[] arr = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < str[j].length(); k++) {
                if (!Character.isDigit(str[j].charAt(k))) {
                    break;
                } else {
                    arr[j] = Integer.parseInt(str[j]);
                }
            }
        }

        int result = 0;
        for (int t = 2; t >= 0; t--) {
            if (t == 2 && arr[t] != 0) {
                result = arr[t] + 1;
                break;
            } else if (t == 1 && arr[t] != 0) {
                result = arr[t] + 2;
                break;
            } else if (t == 0 && arr[t] != 0) {
                result = arr[t] + 3;
            }
        }

        if (result % 3 == 0 && result % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0){
            System.out.println("Fizz");
        } else if (result % 5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
    }
}
