import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int distance = Integer.parseInt(br.readLine());
		int result = distance % 5 == 0 ? distance / 5 : (distance / 5)+ 1;
		
		System.out.println(result);
	}
}