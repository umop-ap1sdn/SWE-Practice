package SortingAlgorithms;

public abstract class SortingAlgorithm {
	
	protected Timer stopwatch;
	protected int millis;
	
	protected String name;
	
	public SortingAlgorithm(String name) {
		this.stopwatch = new Timer();
		millis = 0;
		this.name = name;
	}
	
	private double[] intToDub(int[] array) {
		double[] ret = new double[array.length];
		
		for(int x = 0; x < array.length; x++) {
			ret[x] = array[x];
		}
		
		return ret;
	}
	
	private int[] dubToInt(double[] array) {
		int[] ret = new int[array.length];
		
		for(int x = 0; x < array.length; x++) {
			ret[x] = (int)array[x];
		}
		
		return ret;
	}
	
	protected abstract double[] sort(double[] array);
	
	protected int[] sort(int[] array) {
		return dubToInt(sort(intToDub(array)));
	}
	
	public int[] intSort(int... array) {
		stopwatch.start();
		
		int[] ret = sort(array);
		
		stopwatch.loop = false;
		millis = stopwatch.time;
		
		return ret;
	}
	
	public double[] dubSort(double... array) {
		stopwatch.start();
		
		double[] ret = sort(array);
		
		stopwatch.loop = false;
		millis = stopwatch.time;
		
		
		
		return ret;
	}
	
	public int getTime() {
		return stopwatch.time;
	}
	
	public String getName() {
		return this.name;
	}
}
