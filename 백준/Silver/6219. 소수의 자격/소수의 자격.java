import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int from = Integer.parseInt(st.nextToken());
		int to = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[to + 1];
		
		for (int i = 2; i <= to; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i * i <= to; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= to; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		int count = 0;
		String dStr = String.valueOf(value);
		
		for (int i = from; i <= to; i++) {
			if (isPrime[i]) {
				String num = String.valueOf(i);
				if (num.contains(dStr)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}