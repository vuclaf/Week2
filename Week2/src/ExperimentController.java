import java.util.*;

public class ExperimentController {
	public static void main(String[] args) {
		ExperimentController runTime = new ExperimentController();
		System.out.println("Execution time for front adding: " + runTime.timeAddToFront(6,7,1,100));
		System.out.println("Execution time for back adding: " + runTime.timeAddToBack(6,7,1,100));
		System.out.println("Execution time for sorted adding: " + runTime.timeAddSorted(6,7,1,100));
		System.out.println("Execution time for sorting an unsorted array: " + runTime.timeSortOfUnsorted(6,7,1,100));
		System.out.println("Execution time for sorting a sorted array: " + runTime.timeSortOfSorted(6,7,1,100));
	}
	
	public long timeAddToFront(int numberOfItems, int seed, int min, int max) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=0; i<numberOfItems; i++) {
			RIC.addToFront(rand.nextInt(max-min)+min);
		}
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public long timeAddToBack(int numberOfItems, int seed, int min, int max) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=0; i<numberOfItems; i++) {
			RIC.addToBack(rand.nextInt(max-min)+min);
		}
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public long timeAddSorted(int numberOfItems, int seed, int min, int max) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=min; i<=max; i++) {
			RIC.addSorted(rand.nextInt(max-min)+min);
		}
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public long timeProductSorted(int numberOfItems, int seed, int min, int max, int multiplier) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=min; i<=max; i++) {
			RIC.addToBack(rand.nextInt(max-min)+min);
		}
		RIC.productSorted(multiplier);
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public long timeSortOfUnsorted(int numberOfItems, int seed, int min, int max) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=min; i<=max; i++) {
			RIC.addToBack(rand.nextInt(max-min)+min);
		}
		RIC.selectionSort();
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public long timeSortOfSorted(int numberOfItems, int seed, int min, int max) {
		RandomIntegerContainer RIC = new RandomIntegerContainer();
		Random rand = new Random(seed);
		long startTime = System.currentTimeMillis();
		for (int i=min; i<=max; i++) {
			RIC.addSorted(rand.nextInt(max-min)+min);
		}
		RIC.selectionSort();
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
}
