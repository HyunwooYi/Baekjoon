import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>();
//        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();


        int cnt = sc.nextInt();

        for (int t = 0; t < cnt; t++) {
            test.add(sc.nextInt());
        }

        for(int i = 0; i < cnt; i++){
            temp = bit(test.get(i), new ArrayList<>());

            int k = 0;
            for (Integer v: temp) {
                if (v == 1) {
                    System.out.print(k + " ");
                }
                k++;

            }
        }

    }

    public static ArrayList<Integer> bit(int num, ArrayList<Integer> arrList){
        while (num/2 != 0){
            arrList.add(num%2);
            num /= 2;

        }
        arrList.add(num%2);
        arrList.add(num/2);

        return arrList;
    }

}
