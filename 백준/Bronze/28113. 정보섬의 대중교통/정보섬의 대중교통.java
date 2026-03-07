import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(tokenizer.nextToken());
        int bus = Integer.parseInt(tokenizer.nextToken());
        int subway = Integer.parseInt(tokenizer.nextToken());

        if (bus > subway) {
            System.out.println("Subway");
        } else if (subway > bus) {
            System.out.println("Bus");
        } else {
            System.out.println("Anything");
        }
    }
}