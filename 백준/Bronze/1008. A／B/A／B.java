import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        double result = Double.parseDouble(values[0]) / Double.parseDouble(values[1]);
        System.out.println(result);
    }
}