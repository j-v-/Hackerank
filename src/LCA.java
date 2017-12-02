/**
 * Given a binary tree whose values at each level start with 2^level,
 * find the lowest common ancestor node for two numbers.
 * For example,
 *
 * Level 0:                             1
 * Level 1:                 2                       3
 * Level 2:           4         5             6          7
 * Level 3:        8   9     10   11       12   13    14   15
 *
 * We can see:
 *
 * LCA(13, 15) = (6, 7) = (3, 3)
 * LCA(11, 13) = (5, 6) = (2, 3) = (1, 1)
 *
 * @author jeavydsouza on 23/11/2017.
 */
public class LCA {

    public int run(int i, int j, int count){
        return LCA(i, j, count);
    }

    public int LCA(int i, int j, int count){
        if(i <= 1 || j <= 1)
            return 1;

        if(i % j == 0 || j % i == 0)
            return Math.min(i, j)/2;

        if(i/2 == j/2) {
            return i / 2;
        }
        else{
            return LCA(i/count, j/count, ++count);
        }
    }
}
