/**
 * An equilibrium index of this array is any integer P such that 0 ≤ P < N
 * and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
 * A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
 *
 * @author jeavydsouza on 23/11/2017.
 */
public class Equilibrium {

    public boolean run(int[] arr, int index){
        if(arr.length <= 1)
            return true;
        if(index < 0 && index >= arr.length)
            return false;

        int left_sum = 0;
        int right_sum = 0;
        int i = 0;
        int j = arr.length-1;

        while(i < index){
            left_sum += arr[i++];
        }
        while(j > index){
            right_sum += arr[j--];
        }
        return left_sum == right_sum;
    }
}
