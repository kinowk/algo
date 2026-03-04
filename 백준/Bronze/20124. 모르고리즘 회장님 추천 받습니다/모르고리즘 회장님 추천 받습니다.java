import java.io.*;
import java.util.*;

public class Main {
	static class Person {
		String name;
		int score;
		
		Person(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Person> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			list.add(new Person(name, score));
		}
		
		Collections.sort(list, (a, b) -> {
			if (a.score != b.score) {
				return b.score - a.score;
			}
			return a.name.compareTo(b.name);
		});

		System.out.println(list.get(0).name);
	}
}