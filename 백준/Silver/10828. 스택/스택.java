import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    static void push(int n, List<Integer> list) {
        list.add(n);
    }

    static int pop(List<Integer> list){

        if(empty(list) == 1)
            return -1;
        else {
            int t = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return t;
        }
    }

    static int size(List<Integer> list) {
        return list.size();
    }

    static int empty(List<Integer> list){
        if (list.isEmpty()){
            return 1;
        }else {
            return 0;
        }
    }

    static int top (List<Integer> list) {
        if (list.isEmpty())
            return -1;
        else {
            return list.get(list.size() -1);
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();


        int cnt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < cnt; i++) {
            String text = bf.readLine();

            String[] arr = text.split(" ", 2);
            if (Objects.equals(arr[0], "push")){
                push(Integer.parseInt(arr[1]),list);
            }else if (Objects.equals(arr[0], "top")) {
                System.out.println(top(list));
            }
            else if (Objects.equals(arr[0], "size")) {
                System.out.println(size(list));
            }
            else if (Objects.equals(arr[0], "empty")) {
                System.out.println(empty(list));
            }
            else if (Objects.equals(arr[0], "pop")) {
                System.out.println(pop(list));
            }
        }

    }
}