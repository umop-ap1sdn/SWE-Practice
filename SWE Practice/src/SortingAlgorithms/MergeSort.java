package SortingAlgorithms;

import java.util.Arrays;


public class MergeSort extends SortingAlgorithm {

	public MergeSort() {
		super("Merge Sort");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double[] sort(double[] array) {
		
		if(array.length == 1) return array;
		if(array.length == 2) {
			if(array[0] <= array[1]) return array;
			else {
				double save = array[1];
				array[1] = array[0];
				array[0] = save;
				return array;
			}
		}
		
		double[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
		double[] array2 = Arrays.copyOfRange(array, array.length / 2, array.length);
		
		array1 = sort(array1);
		array2 = sort(array2);
		
		int index1 = 0;
		int index2 = 0;
		
		for(int index = 0; index < array.length; index++) {
			if(index1 >= array1.length) {
				array[index] = array2[index2];
				index2++;
			} else if(index2 >= array2.length || array1[index1] <= array2[index2]) {
				array[index] = array1[index1];
				index1++;
			} else {
				array[index] = array2[index2];
				index2++;
			}
		}
		
		//System.out.printf("%s, %s, %s%n%n", Arrays.toString(array), Arrays.toString(array1), Arrays.toString(array2));
		
		return array;
	}
	
	
}
