import java.util.*;

public class Tester {
	public static void main(String[] args) {
		RandomIntegerContainer RICC = new RandomIntegerContainer();
		Random rand = new Random(69);
		for (int i=1; i<9; i++) {
			RICC.addSorted(rand.nextInt(100-1)+1);
			System.out.println(RICC.toArray()[i-1]);
		}
	}
}
