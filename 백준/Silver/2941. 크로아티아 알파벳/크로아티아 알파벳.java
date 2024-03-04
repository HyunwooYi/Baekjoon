import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int k=0; k<8; k++) {
            if (word.contains(str[k])) {
                word = word.replace(str[k],"@");
            }
        }
        System.out.println(word.length());
    }
}