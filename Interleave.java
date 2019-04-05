/**
 * 
 */
package assignment;

/**
 * @author Justin
 *
 */
public class Interleave {

	public static int[] interleave(int[] arr, int[] arr2) {

		int[] temp = new int[arr.length + arr2.length];

		if (arr.length == arr2.length) {
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				temp[j] = arr[i];
				j++;
				temp[j] = arr2[i];
				j++;
			}
			return temp;
		} else if (arr2.length > arr.length) {
			int j = 0;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				temp[j] = arr[i];
				j++;
			
				temp[j] = arr2[i];
				j++;
				count++;

			}
			while(j < temp.length) {
				temp[j] = arr2[count];
				j++;
				count++;
			}
			
			return temp; 
		} else {
			int j = 0;
			int count = 0;
			for (int i = 0; i < arr2.length; i++) {
				temp[j] = arr[i];
				j++;
			
				temp[j] = arr2[i];
				j++;
				count++;

			}
			while(j < temp.length) {
				temp[j] = arr[count];
				j++;
				count++;
			}
			
			return temp;
		}
		

	}
}
