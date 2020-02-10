import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class RandomIntegerContainerTest {


		int[] result1 = {0,1,65,100};
		int[] result2 = {-32,-31,0,32,333};
		int[] result3 = {-600,-99,-2,-1};
		int[] result4 = {8,8,8,8};
		int[] result5 = {-9,-9,44,44};
		int[] result5prod = {-9,44,44,45};

	@Test
	void testAddToBack() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToBack(0);
			tester.addToBack(1);
			tester.addToBack(65);
			tester.addToBack(100);
			assertTrue(Arrays.equals(tester.toArray(), result1));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testAddToFront() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(100);
			tester.addToFront(65);
			tester.addToFront(1);
			tester.addToFront(0);
			assertTrue(Arrays.equals(tester.toArray(), result1));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testAddSorted() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(100);
			tester.addToFront(1);
			tester.addToFront(0);
			tester.addSorted(65);
			assertTrue(Arrays.equals(tester.toArray(), result1));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testSelectionSort2() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(32);
			tester.addToFront(0);
			tester.addToFront(-31);
			tester.addToFront(333);
			tester.addToFront(-32);
			tester.selectionSort();
			assertTrue(Arrays.equals(tester.toArray(), result2));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testSelectionSort3() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToBack(-600);
			tester.addToBack(-1);
			tester.addToBack(-99);
			tester.addToBack(-2);
			tester.selectionSort();
			assertTrue(Arrays.equals(tester.toArray(), result3));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testSelectionSort4() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(8);
			tester.addToFront(8);
			tester.addToFront(8);
			tester.addToFront(8);
			tester.selectionSort();
			assertTrue(Arrays.equals(tester.toArray(), result4));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	@Test
	void testSelectionSort5() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(44);
			tester.addToFront(44);
			tester.addToBack(-9);
			tester.addToFront(-9);
			tester.selectionSort();
			assertTrue(Arrays.equals(tester.toArray(), result5));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
	
	
	@Test
	void testProductSorted() {
		try {
			RandomIntegerContainer tester = new RandomIntegerContainer();
			tester.addToFront(44);
			tester.addToBack(-9);
			tester.addToBack(44);
			tester.addToFront(-9);
			tester.selectionSort();
			tester.productSorted(-5);
			System.out.println(tester.toArray()[3]);
			assertTrue(Arrays.equals(tester.toArray(), result5prod));
		}
		catch (Exception e) {
			System.out.print("Exception occur: " + e);
		}
	}
}
