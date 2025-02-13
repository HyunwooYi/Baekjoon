import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = new String[3];

        for(int i = 0; i <3; i++) {
            arr1[i] = br.readLine();
        }

        System.out.println(Integer.parseInt(arr1[0]) + Integer.parseInt(arr1[1]) - Integer.parseInt(arr1[2]));
        System.out.println(Integer.parseInt(arr1[0] + arr1[1]) - Integer.parseInt(arr1[2]));
    }
}
