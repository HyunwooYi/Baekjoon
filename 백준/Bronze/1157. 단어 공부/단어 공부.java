import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        int[] alp = new int[26];
        int ch = System.in.read();
        while(true) {
            if(ch > 96) ch = ch - 32;
            if(ch < 65) break;
            alp[ch - 65]++;
            ch = System.in.read();
        }
        short idx = 0, ans = 0;
        for(short i = 1; i < 26; i++) {
            if(alp[idx] < alp[i]) idx = ans = i;
            else if(alp[idx] == alp[i]) ans = -2;
        }
        System.out.print((char)(ans + 65));
    }
}