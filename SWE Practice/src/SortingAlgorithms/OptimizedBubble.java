package SortingAlgorithms;

public class OptimizedBubble extends SortingAlgorithm {
	
	public OptimizedBubble() {
		super("Optimized Bubble");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		boolean swap = true;
		
		int upperBound = array.length;
		
		while(swap) {
			swap = false;
			for(int index = 1; index < upperBound; index++) {
				
				if(array[index] < array[index - 1]) {
					swap(array, index);
					swap = true;
				}
			}
			
			upperBound--;
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
