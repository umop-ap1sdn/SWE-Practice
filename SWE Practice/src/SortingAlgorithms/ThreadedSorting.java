package SortingAlgorithms;

public class ThreadedSorting extends Thread{
	
	SortingAlgorithm algo;
	int[] unsorted = null;
	int[] sorted = null;
	
	public ThreadedSorting(SortingAlgorithm algo) {
		this.algo = algo;
	}
	
	@Override
	public void run() {
		
		this.sorted = algo.intSort(unsorted);
		System.out.printf("%s sorting an array of length %d had a runtime of %dms%n", algo.getName(), sorted.length, algo.getTime());
	}
	
	public void setUnsorted(int[] array) {
		this.unsorted = array;
	}
	
	public int[] getSorted() {
		return this.sorted;
	}
}
