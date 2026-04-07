import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 0;

            for (int b = 2; b < n; b++) {
                int a = b;
                while (--a > 0) {
                    if (((a * a) + (b * b) + m) % (a * b) == 0) {
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }
}