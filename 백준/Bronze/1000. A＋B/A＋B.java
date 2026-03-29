import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int result = Integer.parseInt(values[0]) + Integer.parseInt(values[1]);
        System.out.println(result);
    }
}