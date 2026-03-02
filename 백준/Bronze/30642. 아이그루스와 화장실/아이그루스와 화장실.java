import java.util.*;
import java.io.*;

public class Main {

    static String ANNYONG = "annyong";
    static String INDUCK = "induck";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int floor = Integer.parseInt(br.readLine());
        String animal = br.readLine();
        int currentFloor = Integer.parseInt(br.readLine());

        if (ANNYONG.equals(animal)) {
            if (currentFloor % 2 == 0) {
                int result = currentFloor - 1 > 0 ? currentFloor - 1 : currentFloor + 1;
                System.out.println(result);
            } else {
                System.out.println(currentFloor);
            }
        } else if (INDUCK.equals(animal)) {
            if (currentFloor % 2 == 0) {
                System.out.println(currentFloor);
            } else {
                int result = currentFloor - 1 > 0 ? currentFloor - 1 : currentFloor + 1;
                System.out.println(result);
            }
        }

    }
}