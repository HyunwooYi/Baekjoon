import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int front = 0;
        int temp = 0;
        int back = 1;

        int s = Integer.parseInt(br.readLine());
        br.close();

        if (s == 0) {
            System.out.println(0);
        }
        else if (s == 1) {
            System.out.println(1);
        }
        else {
            for (int i = 2; i <= s; i++) { // 반복 횟수 이미 2번부터 시작
                temp = front;
                front = back;
                back = temp + back;
            }
            System.out.println(back);
        }
    }
}
