package SortingAlgorithms;

public class InsertionSort extends SortingAlgorithm {

	public InsertionSort() {
		super("Insertion Sort");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		for(int index = 1; index < array.length; index++) {
			double val = array[index];
			
			int newLoc = index;
			for(int runner = index - 1; runner >= 0; runner--) {
				if(val >= array[runner]) break;
				newLoc--;
			}
			
			for(int runner = index; runner > newLoc; runner--) {
				array[runner] = array[runner - 1];
			}
			
			array[newLoc] = val;
		}
		
		return array;
	}
	
	
}
