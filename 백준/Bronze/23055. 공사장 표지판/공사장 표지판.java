import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.trim());

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (r == 0 || r == N - 1 || c == 0 || c == N - 1 || r == c || r + c == N - 1) {
                    sb.append('*');
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}