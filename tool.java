import java.util.*;
public class tool{
	public int randint(int range) {
		Random rand = new Random();
		int r = rand.nextInt(range);
		return r;
	}
}