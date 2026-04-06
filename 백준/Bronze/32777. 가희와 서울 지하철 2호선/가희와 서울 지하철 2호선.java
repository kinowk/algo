import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Q = Integer.parseInt(br.readLine());

        while (Q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int N = 43;

            int inner = (b - a + N) % N;
            int outer = (a - b + N) % N;

            if (inner < outer) {
                System.out.println("Inner circle line");
            } else if (inner > outer) {
                System.out.println("Outer circle line");
            } else {
                System.out.println("Same");
            }
        }
    }
}