import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int length = arr.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (Integer.parseInt(arr[i]) > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}