import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] goal = new int[n];
        List<Integer> list = new ArrayList<>();  // 비교할 숫자 넣는 리스트
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            goal[i] = Integer.parseInt(bf.readLine());
        }
//        System.out.println("************");
//        for (int a : goal) {
//            System.out.println(a + "");
//        }
//        System.out.println("************");

//        int result = n;
        int goalIndex = 0;
        // 1~n 까지 진행
        for (int value = 1; value <= n; value++) {

            // 우선 list에 값을 push
            list.add(value);

            // 현제 list에 저장된 값 출력
//            System.out.println("(1)현재 list 저장된 값~~~~~~~");
//            for (int a : list) {
//                System.out.println(a + "");
//            }
//            System.out.println("~~~~~~~~~~~~~");


            // sb에 + 추가하고 sb를 출력
            sb.append("+\n");
//            System.out.println(" push 직후 sb에 저장된 값 : " + sb);
//            System.out.println("---------------------");


            // 이제 목표 배열과 값이 같으면 list에서 값을 제거하고 sb에도 - 추가
            while (!list.isEmpty() && list.get(list.size() - 1) == goal[goalIndex]) {

                list.remove(list.size() - 1); // 같으면 제거
                    sb.append("-\n");
                    goalIndex++;
            }

            // for문 한바퀴 돌고 sb 출력
//            System.out.println("for문 한바퀴 끝내고 sb에 저장된 값 : " + sb);
//            System.out.println("---------------------");
//
//            System.out.println("(2)for문 한바퀴 돌고 list 저장된 값~~~~~~~");
//            for (int a : list) {
//                System.out.println(a + "");
//            }
//            System.out.println("(2)~~~~~~~~~~~~~\n\n");


        }
//        for (int a : list) {
//            System.out.println(a + "");
//        }

//        System.out.println("NEXT^^^^^^^^^^^^^^^^^^^^^^^^");

        // n~1까지 진행
        while (!(list.isEmpty()) && goalIndex <= n) {
            if (list.get(list.size() - 1) == goal[goalIndex]) {
                list.remove(list.size() - 1);
                sb.append("-\n");
//                System.out.println("현재 상태 : " + sb);
//                System.out.println("---------------------");
//                System.out.println("현재 list 저장된 값~~~~~~~");
//                for (int a : list) {
//                    System.out.println(a + "");
//                }
//                System.out.println("~~~~~~~~~~~~~");
            }
            else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }

            goalIndex++;
        }
//        System.out.println("********");
//        System.out.println("최종 list 저장된 값~~~~~~~");
//        for (int a : list) {
//            System.out.println(a + "");
//        }
//
//        System.out.println("최종값");
        System.out.println(sb);
    }
}