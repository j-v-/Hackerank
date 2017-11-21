/**
 * Finds a single unpaired number in array of numbers using Bitwise operation
 *
 * @author jeavydsouza on 20/11/2017.
 */
public class Unpaired {

    public int run(int[] student_list) {
        int unpaired = getUnpaired(student_list);
        return unpaired;
    }

    public int getUnpaired(int[] student_list){
        int result = 0;
        for (int i : student_list)
            result ^= i;
        return result;
    }
}
