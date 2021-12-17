package SortingAlgorithms;

public class ArrayCreator {
	
	public static int[] intCreate(int range, int length, boolean neg) {
		
		int[] ret = new int[length];
		for(int index = 0; index < length; index++) {
			ret[index] = (int) (Math.random() * range);
			
			if(neg) {
				ret[index] = (ret[index] * 2) - range;
			}
		}
		
		return ret;
	}
}
