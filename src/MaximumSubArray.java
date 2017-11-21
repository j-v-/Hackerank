/**
 * For an array with n elements, a = (a1, a2, a3, ... , an),
 * find the maximum possible sum of a contigous subarray.
 * If the maximum element is bigger than the sum, return that element.
 *
 * @author jeavydsouza on 20/11/2017.
 */
public class MaximumSubArray {

    public int findMaximumSubarray(int[] arr){
        int maximum_sum = maxKadaneSubarray(arr);
        return maximum_sum;
    }

    public int maxKadaneSubarray(int[] arr){
        int max_curr; int max_global ;
        max_curr = max_global = arr[0];

        for(int i = 1; i < arr.length; i++){

            if (max_curr + arr[i] < arr[i])
                max_curr = arr[i];
            else
                max_curr += arr[i];

            if (max_global < max_curr)
                max_global = max_curr;
        }
        return max_global;
    }
}
