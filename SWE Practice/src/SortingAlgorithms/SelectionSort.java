package SortingAlgorithms;

public class SelectionSort extends SortingAlgorithm{

	public SelectionSort() {
		super("Selection Sort");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		double smallest;
		int smallestIndex;
		
		for(int index1 = 0; index1 < array.length - 1; index1++) {
			
			smallest = array[index1];
			smallestIndex = index1;
			
			for(int index2 = index1 + 1; index2 < array.length; index2++) {
				if(array[index2] < smallest) {
					smallest = array[index2];
					smallestIndex = index2;
				}
			}
			
			if(smallestIndex != index1) array = swap(array, smallestIndex, index1);
		}
		
		return array;
	}
	
	public double[] swap(double[] array, int index1, int index2) {
		double save = array[index1];
		array[index1] = array[index2];
		array[index2] = save;
		
		return array;
	}
}
