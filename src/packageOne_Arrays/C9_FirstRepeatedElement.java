/**
 * 
 */
package packageOne_Arrays;

import java.util.Hashtable;

/**
 * @author Remoz World
 * 
 */
public class C9_FirstRepeatedElement {

	private static Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

	/**
	 * Find the First repeated element in an ARRAY.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 6, 5 };
		System.out.println("First Repeated Element: "
				+ getFirstRepeatedElement(array));
	}

	private static int getFirstRepeatedElement(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (hashtable.containsKey(array[i])) {
				return array[i];
			} else {
				hashtable.put(array[i], 1);
			}
		}
		return 0;

	}

}
