import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int max = 1;
        int i = 1;

        while (num > max) {
            max = max +(6*i);
            i++;
        }
        System.out.println(i);


    }
}