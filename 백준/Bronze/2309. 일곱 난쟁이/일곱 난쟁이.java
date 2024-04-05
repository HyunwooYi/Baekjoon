import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        int sum = 0;


        for (int i = 0; i < 9; i++) {
            array.add(Integer.parseInt(br.readLine()));
            sum += array.get(i);
        }
        br.close();
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                int result = 0;
                result = array.get(i) + array.get(j);

                if ( (sum - result) == 100) {
                    for (int k = 0; k < array.size(); k++) {
                        if (k == i || k == j) {
                            continue;
                        }else {
                            System.out.println(array.get(k));
                        }
                    }
                    System.exit(0);
                }

            }
        }

    }
}
