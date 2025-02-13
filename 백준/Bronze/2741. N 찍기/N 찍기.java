import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();


        for(int i =1; i<=num; i++) {
            list.add(i);
        }

        for(int j = 0; j < num; j++){
            sb.append(list.get(j));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
