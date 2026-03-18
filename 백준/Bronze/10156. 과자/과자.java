import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int cost = Integer.parseInt(tokenizer.nextToken());
		int count = Integer.parseInt(tokenizer.nextToken());
		int amount = Integer.parseInt(tokenizer.nextToken());
		int total = cost * count;
		
		if (amount >= total) {
			System.out.println(0);
			return;
		} else {
			System.out.println(total - amount);
		}
	}
}
