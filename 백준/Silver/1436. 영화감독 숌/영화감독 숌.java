import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int t = 1;
        int worseNumber = 666;

        while (t != num) {
            worseNumber++;
            if (String.valueOf(worseNumber).contains("666")) {
                t++;
            }
        }
        System.out.println(worseNumber);

    }
}