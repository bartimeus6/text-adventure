import java.util.*;
public class tool{
	public int randint(int range) {
		Random rand = new Random();
		int r = rand.nextInt(range);
		return r;
	}
	public int nextInt() {
		Scanner scan = new Scanner(System.in);
		int input;
		input = scan.nextInt();
		return input;
	}
	public String nextLine() {
		Scanner scan = new Scanner(System.in);
		String input;
		input = scan.nextLine();
		return input;
	}
}