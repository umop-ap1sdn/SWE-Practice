package SortingAlgorithms;

public class BubbleSort extends SortingAlgorithm {

	public BubbleSort() {
		super("Bubble Sort");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		boolean swap = true;
		
		while(swap) {
			swap = false;
			for(int index = 1; index < array.length; index++) {
				
				if(array[index] < array[index - 1]) {
					swap(array, index);
					swap = true;
				}
			}
		}
		
		return array;
	}
	
	private double[] swap(double[] array, int index) {
		double less = array[index];
		array[index] = array[index - 1];
		array[index - 1] = less;
		
		return array;
	}
	
}
