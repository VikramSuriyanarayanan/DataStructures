/**
 * 
 */
package packageOne_Arrays;

import java.util.Hashtable;

/**
 * @author Remoz World
 * 
 */
public class C5_MaxOccurance {

	private static Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

	/**
	 * Finds the maximum occurance count of element in an array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 2, 2, 2, 4, 4, 2 };
		System.out.println(getCount(array));
	}
	
	private static int getCount(int[] array) {
		int count = 0; int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(hashtable.containsKey(array[i])) {
				count = hashtable.get(array[i]);
				count++;
				hashtable.put(array[i], count);
			}else {
				hashtable.put(array[i], 1);
			}
			
			if(count > max) {
				max = count;
			}
		}
		
		return max;
	}

}
