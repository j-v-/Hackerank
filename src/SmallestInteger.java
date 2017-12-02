import java.util.Arrays;

/**
 * Finds the smallest positive number missing in an array.
 * If smallest number is less than equal to 0 it returns 1
 *
 * @author jeavydsouza on 23/11/2017.
 */
public class SmallestInteger {

    public int getSmallestInteger(int[] arr){
        int n  = arr.length;
        if(n <= 1 && arr[n-1] > 0)
            return 1;

        Arrays.sort(arr);
        int i = 0;
        int min = 0;
        while(i < n-1){
            if(arr[i] > 0 && arr[i+1] - arr[i] > 1)
                return arr[i] + 1;
            if(arr[i] > min)
                min = arr[i];
            i++;
        }
        if(min > 0)
            return arr[n-1] + 1;
        else
            return 1;
    }
}
