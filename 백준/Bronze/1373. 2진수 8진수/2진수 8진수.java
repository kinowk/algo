import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();

        int len = binary.length();
        int mod = len % 3;

        if (mod != 0) {
            int pad = 3 - mod;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pad; i++) sb.append('0');
            sb.append(binary);
            binary = sb.toString();
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < binary.length(); i += 3) {
            String chunk = binary.substring(i, i + 3);
            int val = (chunk.charAt(0) - '0') * 4
                    + (chunk.charAt(1) - '0') * 2
                    + (chunk.charAt(2) - '0');

            result.append(val);
        }

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        System.out.println(result);
    }
}