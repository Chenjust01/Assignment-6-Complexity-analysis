/**
 * 
 */
package assignment;

/**
 * @author Justin
 *
 */
public class Contains {
	// d returns true if there is a element dubs[i] in the array such that c
	public static boolean contains(double[] dubs, double eps, double d) {
		for(int i =0; i < dubs.length; i++) {
			if ((dubs[i]-d) < eps) {
				return true;
			}
		}
		return false; 
	}
}
