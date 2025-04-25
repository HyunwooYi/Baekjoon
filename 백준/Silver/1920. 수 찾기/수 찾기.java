import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String[] array1 = str1.split(" ");

        int M = Integer.parseInt(bf.readLine());
        String str2 = bf.readLine();
        String[] array2 = str2.split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(array1));
        for(String answer: array2){
            if(set.contains(answer)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}