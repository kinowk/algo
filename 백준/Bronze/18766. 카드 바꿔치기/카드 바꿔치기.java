import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.valueOf(br.readLine());
		
		for (int i = 0; i < count; i++) {
			int length = Integer.valueOf(br.readLine());
			String[] firstArr = br.readLine().split(" ");
			String[] secondArr = br.readLine().split(" ");
			
			Arrays.sort(firstArr);
			Arrays.sort(secondArr);
			
			if (Arrays.equals(firstArr, secondArr)) {
				System.out.println("NOT CHEATER");
			} else {
				System.out.println("CHEATER");
			}
		}
	}
}