import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = br.readLine();

        if ("(1)".equals(inputValue)) {
            System.out.println(0);
            return;
        }

        if (inputValue.indexOf("1)") > -1 || inputValue.indexOf("(1") > -1 || inputValue.indexOf("()") > -1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}