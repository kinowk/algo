import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int current = Integer.parseInt(br.readLine());
        int goal = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        if (current > 0) {
            System.out.println((goal - current) * e);
        } else if (current < 0) {
            System.out.println(d + (goal * e) - (current * c));
        }
    }
}