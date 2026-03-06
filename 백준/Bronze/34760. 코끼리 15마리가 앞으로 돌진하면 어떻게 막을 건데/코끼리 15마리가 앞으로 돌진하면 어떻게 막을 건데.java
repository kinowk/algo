import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int length = arr.length;
        int lastValue = arr[length - 1];

        if (length == 1) {
            System.out.println(arr[0]);
            return;
        }

        Arrays.sort(arr);
        
        int a = arr[length - 1];
        int b = arr[length - 2];
        int result = 0;
        if (a == b) {
            result = a + 1;
        }

        if (a != b) {
            if (a == lastValue) {
                result = a;
            } else {
                result = a + 1;
            }
        }

        System.out.println(result);
    }
}