import java.util.*;

public class RandomIntegerContainer {
	private ArrayList<Integer> mainList;
	public RandomIntegerContainer() {
		mainList = new ArrayList<Integer>();
	}
	
	public void addToFront(int input) {
		mainList.add(0,input);
	}
	
	public void addToBack(int input) {
		mainList.add(input);
	}
	
	public void addSorted(int input) {
		int x = 0;
		int y = 0;
		if (mainList.size()==0) {
			mainList.add(input);
			return;
		}
		if (input<mainList.get(0)) {
			mainList.add(0,input);
		}
		else if (input<mainList.get(mainList.size()-1)) {
			mainList.add(input);
		}
		for (int i = 0; i<mainList.size()-1; i++) {
			x = mainList.get(i);
			y = mainList.get(i+1);
			if (x<=input && input<=y) {
				mainList.add(i+1,input);
			}
		}
	}
	
	public void productSorted(int input) {
		if (mainList.size()==0) {
			mainList.add(input);
			return;
		}
		addSorted(input*mainList.get(0));
	}
	
	public void selectionSort() {
		int i,j, min, temp;
		for(i=0; i<mainList.size(); i++){
			min = mainList.get(i);
			for(j=i+1; j<mainList.size();j++){
				temp=mainList.get(i);
				if (mainList.get(j)<min){
					mainList.set(i, min);
				}
				mainList.set(j, temp);
			}
		}
	}
	
	public int[] toArray() {
		int[] intArray = new int[mainList.size()];
		for (int i=0; i<mainList.size(); i++) {
			intArray[i] = (int)mainList.get(i);
		}
		return intArray;
	}
}
