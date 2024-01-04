import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();


        word = word.toUpperCase();
        ArrayList<Character> list = new ArrayList();

        for (int i = 0 ; i < word.length(); i++){
            list.add(word.charAt(i));
        }

        Stream<Character> stream = list.stream();
        Map<Character, Integer> map = stream.collect(
                Collectors.toMap(Function.identity(), value -> 1, Integer::sum)
        );

        int value = Collections.max(map.values());

        int cnt=0;
        for (Character key : map.keySet()){
            if (map.get(key).equals(value)){
                cnt++;
            }
        }
        if (cnt == 1){
            for (Character key : map.keySet()){
                if (map.get(key).equals(value)){
                    System.out.println(key);
                }
            }
        }
        else {
            System.out.println("?");
        }

    }
}
