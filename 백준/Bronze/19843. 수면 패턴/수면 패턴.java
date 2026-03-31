import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int value = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        List<String> list = List.of("Mon", "Tue", "Wed", "Thu", "Fri");

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String day1 = st.nextToken();
            int time1 = Integer.parseInt(st.nextToken());
            String day2 = st.nextToken();
            int time2 = Integer.parseInt(st.nextToken());

            int sleepTime;
            if (day1.equals(day2)) {
                sleepTime = (time2 - time1);
            } else {
                int dayDiff = list.indexOf(day2) - list.indexOf(day1);
                sleepTime = (24 * dayDiff) + time2 - time1;
            }
            value -= sleepTime;
        }

        if  (value <= 0) {
            System.out.println(0);
            return;
        }

        if (value > 48) {
            System.out.println(-1);
        } else {
            System.out.println(value);
        }

    }
}