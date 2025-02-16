import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] music = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] reverseMusic = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] user = new String[8];
        int aResult = 0;
        int dResult = 0;

        for (int i = 0; i < 8; i++) {
            user[i] = st.nextToken();
        }

        for (int j = 0; j < 8; j++) {
            if (Objects.equals(user[j], music[j])) {
                aResult++;
            } else if (Objects.equals(user[j], reverseMusic[j])) {
                dResult++;
            }
        }

        if (aResult == 8)
            System.out.println("ascending");
        else if (dResult == 8)
            System.out.println("descending");
        else
            System.out.println("mixed");

    }
}
