import java.io.*;
import java.util.*;

public class Main {

    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
        }

        long result = 0;

        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            result = (result + arr[i] * sum) % MOD;
        }

        System.out.println(result);
    }
}