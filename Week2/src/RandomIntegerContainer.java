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
	
	public void selectionSort() {
		int i,j,temp,minInd;
		for(i=0; i<mainList.size()-1; i++){
			minInd = i;
			for(j=i+1; j<mainList.size();j++){
				if (mainList.get(j)<mainList.get(minInd)){
					minInd=j;
				}
			}
			temp =mainList.get(i);
			mainList.set(i, mainList.get(minInd));
			mainList.set(minInd, temp);
		}
	}
	
	public void productSorted(int input) {
		if (mainList.size()==0) {
			mainList.add(input);
			return;
		}
		int temp = input*mainList.get(0);
		mainList.set(0, temp);
		this.selectionSort();
	}
	
	public void addSorted(int input) {
		int index=0;
		if (mainList.size()==0) {
			mainList.add(input);
		}
		else if (input<=mainList.get(0)) {
			mainList.add(0,input);
		}
		else if (input>=mainList.get(mainList.size()-1)) {
			mainList.add(input);
		}
		else {
			for (int i=0;i<mainList.size()-1;i++) {
				if(input<=mainList.get(i+1)&&input>=mainList.get(i)) {
					index=i+1;
				}
			}
			mainList.add(index,input);
		}
	}
	
	public int[] toArray() {
		int[] intArray = new int[mainList.size()];
		for (int i=0; i<mainList.size(); i++) {
			intArray[i] = (int)mainList.get(i);
		}
		return intArray;
	}
	
	public void addAll(ArrayList<Integer> test) {
		mainList.addAll((Collection<? extends Integer>) test);
	}
}
