import java.util.Arrays;

/**
 * Given a number and an int array of potential factors finds any two factors that belong in the array
 *
 * @author jeavydsouza on 22/11/2017.
 */
public class TwoFactorArray {

    public int[] run(int[] arr, int number){
        int[] factors = new int[2];

        for(int i = 0; i < arr.length; i++){

            if( arr[i] > 1 && number % arr[i] == 0){

                for (int j = i + 1; j < arr.length; j++){

                    if( arr[j] ==  number / arr[i]) {
                        factors[0] = arr[i];
                        factors[1] = arr[j];
                        return factors;
                    }

                }
            }
        }

        return factors;
    }
}
