import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int N = sc.nextInt();
        int K = sc.nextInt();


        for(int i = 1; i <= N; i++){
            if ( N % i == 0){
                arrList.add(i);
            }
        }
        if (arrList.size() < K){
            System.out.println(0);
        }
        else{
            System.out.println(arrList.get(K-1));
        }

    }

}
