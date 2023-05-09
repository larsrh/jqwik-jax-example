package info.hupel.jax;

import java.util.Arrays;

public class Library {

    public static int[] sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        return copy;
    }

    public static boolean isSorted(int[] array) {
        if (array.length <= 1)
            return true;
	    for (int i = 0; i < array.length - 1; ++i)
	        if (array[i+1] < array[i])
                return false;
	    return true;
    }

}
