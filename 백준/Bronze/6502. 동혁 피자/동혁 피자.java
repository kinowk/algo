import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        while (true) {
            index++;
            String value = br.readLine();
            if ("0".equals(value)) {
                break;
            }

            StringTokenizer st = new StringTokenizer(value);
            double r = Long.parseLong(st.nextToken());
            double w = Long.parseLong(st.nextToken()) / 2.0;
            double l = Long.parseLong(st.nextToken()) / 2.0;

            if (r * r >= ((w * w) + (l * l))) {
                System.out.println("Pizza " + index + " fits on the table.");
            } else {
                System.out.println("Pizza " + index + " does not fit on the table.");
            }
        }
    }
}