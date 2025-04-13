import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] temp = new int[3];

        while(true) {
            String[] str = bf.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            temp[0] = a;
            int b = Integer.parseInt(str[1]);
            temp[1] = b;
            int c = Integer.parseInt(str[2]);
            temp[2] = c;

            Arrays.sort(temp);

            if (temp[0] ==0 & temp[1]==0 & temp[2]==0){
                break;
            }else if (temp[0] * temp[0] + temp[1] * temp[1] == temp[2] * temp[2]){
                sb.append("right\n");
            }else {
                sb.append("wrong\n");
            }
        }
        System.out.println(sb);
    }
}
