import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int cnt = sc.nextInt();
        int count = 0;

        for (int i = 0; i < cnt; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        Boolean[] bs = new Boolean[26];

        for(int i =0; i<26; i++)
            bs[i] = false;
        
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {

                if (bs[now - 'a'] == false) {
                    bs[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }

            } else {
                continue;
            }
        }
        return true;
    }
}
