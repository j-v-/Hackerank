import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jeavydsouza on 21/11/2017.
 */
public class HackerrankTest {

    @Test
    public void testSemiPrime(){
        assertEquals(true, new SemiPrime().run(629));
    }

    @Test
    public void testUnpaired(){
        assertEquals(6, new Unpaired().run(new int[]{2, 4, 6, 4, 2}));
    }

    @Test
    public void testRomanNumerals(){
        assertEquals("MMXIV", new RomanNumeral().findRomanEquivalent(2014));
    }

    @Test
    public void testMaximumSubarray(){
        assertEquals(6, new MaximumSubArray().maxKadaneSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(-2, new MaximumSubArray().maxKadaneSubarray(new int[]{-2,-10,-4}));
    }

    @Test
    public void testClockAngle(){
        double clock_angle = new ClockAngle().run(11, 10);
        assertEquals(85, clock_angle, 0.1);

        clock_angle = new ClockAngle().run(7, 0);
        assertEquals(150, clock_angle, 0.1);

        clock_angle = new ClockAngle().run(5, 15);
        assertEquals(67.5, clock_angle, 0.1);
    }

    @Test
    public void testBalancedTree(){
        Node node = new Node(5);
        assertEquals(node.data, 5);

        node.left = new Node(3);
        node.right = new Node(7);
        assertEquals(true, node.contains(7));

        node.left.left = new Node(2);
        node.left.right = new Node(4);
        node.right.left = new Node(6);
        node.right.right = new Node(8);
        assertEquals(true, new Node(1).checkBST(node));

        assertEquals(7, node.size(node));
        assertEquals(2, node.minValueBST(node));
        assertEquals(8, node.maxValueBST(node));

        assertEquals(node , node.LCA(node, node.left.right, node.right.left));
        assertEquals(node.right , node.LCA(node, node.right.left, node.right.right));

        //node.printEachLevel(node);
    }

    @Test
    public void testLinkedList(){
        LinkedList list = new LinkedList();
        LinkedList.Link head = list.new Link(1);
        head.next = list.new Link(2);
        head.next.next = list.new Link(3);
        head.next.next.next = list.new Link(4);
        assertEquals(false, new LinkedList().hasCycle(head));

        head.next.next.next.next = head.next;
        assertEquals(true, new LinkedList().hasCycle(head));
    }

    @Test
    public void testSmallestInteger(){
        SmallestInteger sm = new SmallestInteger();
        assertEquals(5, sm.getSmallestInteger(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, sm.getSmallestInteger(new int[]{1, 2, 3}));
        assertEquals(1, sm.getSmallestInteger(new int[]{-1, -3}));
    }

    @Test
    public void testEquilibriumIndex(){
        Equilibrium eq = new Equilibrium();
        int[] arr = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
        assertEquals(true, eq.run(arr, 1));
        assertEquals(true, eq.run(arr, 3));
        assertEquals(true, eq.run(arr, 7));
        assertEquals(false, eq.run(arr, 2));

    }

    @Test
    public void testBinaryGap(){
        BinaryGap bg = new BinaryGap();
        assertEquals(0, bg.getMaxBinaryGap(15));
        assertEquals(1, bg.getMaxBinaryGap(20));
        assertEquals(4, bg.getMaxBinaryGap(529));
        assertEquals(5, bg.getMaxBinaryGap(1041));
    }

    @Test
    public void testLCA(){
        LCA lca = new LCA();
        assertEquals(5, lca.run(10, 11, 1));
        assertEquals(12, lca.run(25, 100, 1));
        assertEquals(3, lca.run(13, 15, 1));
        assertEquals(1, lca.run(11, 13, 1));
    }

    @Test
    public void testBinaryTree(){
        Node node = new Node(4);
        node.left = new Node(5);
        node.right = new Node(6);

        node.left.left = new Node(3);
        node.left.right = null;
        node.left.left.left = new Node(7);
        node.left.left.right = null;

        node.right.left = new Node(1);
        node.right.right = new Node(6);

        int height = node.maxHeight(node);
        assertEquals(3, height);

        int maxDistinctNodesInPath = node.getMaxDistinctNodePathSize(node);
        assertEquals(4, maxDistinctNodesInPath);
    }

    @Test
    public void testTwoFactorArray(){
        TwoFactorArray fa = new TwoFactorArray();
        int[] factors = fa.run(new int[]{-1, 0, 32, 5, 7, 4, 3}, 21);
        assertTrue(factors[0] * factors[1] == 21);

        factors = fa.run(new int[]{-1, 0, 32, 5, 7, 4, 3}, 35);
        assertFalse (factors[0] * factors[1] == 36);

    }

    @Test
    public void testIncrementDigitArray(){
        DigitArray da = new DigitArray();
        assertArrayEquals(new int[]{1,0,0,0}, da.incrementDigitArray(new int[]{9,9,9}));
        assertArrayEquals(new int[]{1,2}, da.incrementDigitArray(new int[]{1,1}));
        assertArrayEquals(new int[]{5}, da.incrementDigitArray(new int[]{4}));
        assertArrayEquals(new int[]{2,0}, da.incrementDigitArray(new int[]{1,9}));

    }
}
