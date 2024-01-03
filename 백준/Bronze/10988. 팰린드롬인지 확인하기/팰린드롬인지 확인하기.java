import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int half_cnt = word.length()/2 ;

        boolean value = true;

        for(int i = 0; i < half_cnt; i++){
            if (word.charAt(i) != word.charAt(word.length()-(i+1))){
                value = false;
                break;
            }
            else{
                value = true;
            }
        }
        if (value){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

}
