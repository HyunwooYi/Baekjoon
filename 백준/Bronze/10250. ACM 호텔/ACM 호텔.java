import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[count][3];
        String[] arr;
        int number = 1;
        int n = 1;

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            arr = str.split(" ");
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for (int time = 0; time < count; time++) {
            int height = array[time][0]; //3
            int width = array[time][1];  //3
            int[][] hotel = new int[width][height];  // 3 3
            number = 1;
            
            for (int w = 0; w < width; w++) {
                for (int h = 0; h < height; h++) {
                    hotel[w][h] = number;
                    
                    if (number == array[time][2]) {
                        System.out.print(h+1);
                        if (w < 9) {
                            number++;
                            System.out.println("0" + (w + 1));
                        }
                        else if (w== 9) {
                            number++;
                            System.out.println(w+1);
                        }
                        else {
                            number++;
                            System.out.println(w+1);
                        }
                        break;
                    }
                    number++;
                }
                if (number > array[time][2]) {
                    break;
                }
            }
        }
    }


}
