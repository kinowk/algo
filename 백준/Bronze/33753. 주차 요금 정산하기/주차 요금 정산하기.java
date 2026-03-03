import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int defaultCharge = Integer.parseInt(tokenizer.nextToken());
		int minutes = Integer.parseInt(tokenizer.nextToken());
		int additionalCharge = Integer.parseInt(tokenizer.nextToken());
		int times = Integer.parseInt(br.readLine());
		
		if (times <= minutes) {
			System.out.println(defaultCharge);
			return;
		}
		
		int ceil = (int) Math.ceil((times - minutes) / (double) minutes);
		System.out.println(defaultCharge + (ceil * additionalCharge));
	}
}
