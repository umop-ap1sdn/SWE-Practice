package SortingAlgorithms;

import java.util.Arrays;

public class SortingRunner {
	public static void main(String[]args) {
		SortingAlgorithm[] sorts = {new CocktailSort(), new OptimizedCocktail(), new BubbleSort(), new OptimizedBubble(), new SelectionSort(), new InsertionSort(), new MergeSort()};
		
		ThreadedSorting[] threads = new ThreadedSorting[sorts.length];
		
		for(int index = 0; index < sorts.length; index++) {
			threads[index] = new ThreadedSorting(sorts[index]);
		}
		
		//testSorts(sorts, 100000, 100000, true, false);
		
		simulSort(threads, 100000, 100000, true, false);
		
		
		 /*
		SortingAlgorithm test = new MergeSort();
		
		int[] toSort = ArrayCreator.intCreate(100, 30, false);
		
		System.out.println(Arrays.toString(toSort));
		
		System.out.println(Arrays.toString(test.intSort(toSort)));
		
		// */
	}
	
	public static void testSorts(SortingAlgorithm[] sorts, int size, int range, boolean whole, boolean neg) {
		
		double[] dubArray = new double[0];
		int[] wholeArray = new int[0];
		
		if(whole) wholeArray = ArrayCreator.intCreate(range, size, neg);
		
		for(SortingAlgorithm n: sorts) {
			if(whole) n.intSort(wholeArray);
			
			System.out.printf("%s sorting an array of length %d had a runtime of %dms%n", n.getName(), size, n.getTime());
		}
	}
	
	public static void simulSort(ThreadedSorting[] sorts, int size, int range, boolean whole, boolean neg) {
		
		int[] wholeArray = new int[0];
		
		if(whole) wholeArray = ArrayCreator.intCreate(range, size, neg);
		
		for(ThreadedSorting n: sorts) {
			n.setUnsorted(wholeArray);
			n.start();
		}
	}
}
