package SortingAlgorithms;

public class CocktailSort extends SortingAlgorithm {

	public CocktailSort() {
		super("Cocktail Sort");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		boolean swap = true;
		
		int direction = 1;
		int tail = -1;
		
		int index = 0;
		
		while(swap) {
			swap = false;
			index += direction;
			
			while(index < array.length && index >= 0) {
				if(array[index] * direction < array[index + tail] * direction) {
					swap(array, index, tail);
					swap = true;
				}
				
				index += direction;
			}
			
			tail = direction;
			direction *= -1;
			
			index += direction;
		}
		
		return array;
	}
	
	private double[] swap(double[] array, int index, int tail) {
		double less = array[index];
		array[index] = array[index + tail];
		array[index + tail] = less;
		
		return array;
	}
	
}
