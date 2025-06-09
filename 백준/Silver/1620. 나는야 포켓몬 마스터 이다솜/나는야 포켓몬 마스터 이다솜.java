import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static boolean isNumeric(String question) {
        if (question == null || question.isEmpty())
            return false;
        try {
            Integer.parseInt(question);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String[] arr = str1.split(" ");
        // arr[0]의 값은 N (포켓몬의 개수)
        // arr[1]의 값은 M (문제의 개수)

        Map<Integer, String> pokedexByNumber = new HashMap<>();
        Map<String, Integer> pokedexByName = new HashMap<>();

        for (int i = 1; i <= Integer.parseInt(arr[0]); i++) {
            String temp1 = br.readLine();
            pokedexByNumber.put(i, temp1);
        }

        for(int t = 1; t <=Integer.parseInt(arr[0]); t++) {
            pokedexByName.put(pokedexByNumber.get(t), t);
        }

        for (int j = 1; j <= Integer.parseInt(arr[1]); j++) {
            String question = br.readLine();
            if (isNumeric(question)) {
                System.out.println(pokedexByNumber.get(Integer.parseInt(question)));
            } else {
                System.out.println(pokedexByName.get(question));
            }
        }
    }


}


