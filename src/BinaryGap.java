/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.
 *
 * @author jeavydsouza on 23/11/2017.
 */
public class BinaryGap {

    public int getMaxBinaryGap(int n){
        while(n != 0 && (n & 1) == 0){
            n >>>= 1;
        }
        int max = 0;
        int gap = 0;
        while(n != 0){
            if((n & 1) == 0){
                max = Math.max(++gap, max);
            }
            else{
                gap = 0;
            }
            n >>>= 1;
        }
        return max;
    }
}
