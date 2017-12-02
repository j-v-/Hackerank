/**
 * Given an int array each of whose elements make a number from left to right,
 * add one to the number and return the new array representing the new array.
 * For example, [9,9,9] = 999 with addition of 1 becomes [1,0,0,0]
 *
 * @author jeavydsouza on 27/11/2017.
 */
public class DigitArray {

    public int[] incrementDigitArray(int[] arr){
        int n = arr.length;
        boolean carryDigit = n <= 1;
        for(int i = n - 1 ; i > 0 ; i--){//1,9
            if(arr[i] != 9) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
            carryDigit = true;
        }

        if(carryDigit){
            if(arr[0] == 9) {
                int[] extendDigits = new int[arr.length + 1];
                extendDigits[0] = 1;
                return extendDigits;
            }
            else {
                arr[0] += 1;
            }
        }

        return arr;
    }
}
