/*
* BufferWriter과 System.out.println 시간 비교
*/

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int out = 0;
        int in = 0;
        int Max = 0;
        int present = 0;

        for (int i = 0; i < 10; i++) {

            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str, " ");

            out = Integer.parseInt(st.nextToken());
            in = Integer.parseInt(st.nextToken());

            if ( i == 0) {
                Max = in;
                present = in;
            }
            else {
                present = present - out + in;
                if (present > Max) {
                    Max = present;
                }
            }
        }

        br.close();
        System.out.println(Max);
//        bw.write(String.valueOf(Max));
//        bw.flush();
//        bw.close();


    }
}
