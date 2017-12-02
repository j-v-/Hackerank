import javax.swing.undo.CannotUndoException;
import java.util.*;
import java.util.LinkedList;

/**
 * @author jeavydsouza on 21/11/2017.
 */
public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new Node(value);
            }
            else{
                left.insert(value);
            }
        }
        else{
            if(right == null){
                right = new Node(value);
            }
            else{
                right.insert(value);
            }
        }
    }


    public void insertAny(int value, int max, Node node){
        if( value > max) {
            return;
        }
        else{
            if(node.left == null || node.right == null){
                if(node.left == null) {
                    node.left = new Node(value++);
                }
                if(node.right == null) {
                    node.right = new Node(value++);
                }
                insertAny(value++, max, node.left);
                insertAny(value++, max, node.right);
            }
        }
    }


    public boolean contains(int value){
        if (value == data)
            return true;
        if (value < data){
            if (left == null)
                return false;
            else
                return left.contains(value);
        }
        else{
            if (right == null)
                return false;
            else
                return right.contains(value);
        }
    }


    public void printInOrder(){
        if (left != null)
            left.printInOrder();
        System.out.println(data);
        if(right != null)
            right.printInOrder();
    }


    public boolean checkBST(Node root){
        if(root == null)
            return true;

        return isBalanced(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBalanced(Node node, int min, int max){
        if(node == null)
            return true;
        return (node.data >= min && node.data <= max)? isBalanced(node.left, min, node.data) &&
                isBalanced(node.right, node.data, max) : false;
    }


    public int size(Node node){
        if(node == null)
            return 0;
        int leftSize = size(node.left);
        int rightSize = size(node.right);
        return 1 + leftSize + rightSize;
    }


    public int maxHeight(Node node){
        if(node == null)
            return -1;
        int leftHeight = maxHeight(node.left);
        int rightHeight = maxHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int minValueBST(Node node){
        if(node == null)
            return -1;
        Node temp = node;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }

    public int maxValueBST(Node node){
        if(node == null)
            return -1;
        Node temp = node;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }


    public Node LCA(Node root, Node i, Node j){
        if(root == null)
            return null;
        if(root == i || root == j)
            return root;
        Node left = LCA(root.left, i, j);
        Node right = LCA(root.right, i, j);
        if(left != null && right != null)
            return root;
        if(left == null && right == null)
            return null;
        return left != null ? left : right;
    }


    public void printEachLevel(Node node){
        if(node == null)
            return;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(node);
        while(!q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                node = q1.poll();
                System.out.print(node.data + " ");
                if(node.left != null)
                    q2.add(node.left);
                if(node.right != null)
                    q2.add(node.right);
            }
            System.out.println();
            while(!q2.isEmpty()){
                node = q2.poll();
                System.out.print(node.data + " ");
                if(node.left != null)
                    q1.add(node.left);
                if(node.right != null)
                    q1.add(node.right);
            }
            System.out.println();
        }
    }


    public int getMaxDistinctNodePathSize(Node node){
        List<Set<Integer>> list = new ArrayList<Set<Integer>>();
        Stack<Node> stack = new Stack<Node>();
        inorderTraverse(node, stack, list);
        int max = -1;
        for(Set s : list){
            if(s.size() > max)
                max = s.size();
        }
        return max;
    }

    public void inorderTraverse(Node node, Stack<Node> stack, List<Set<Integer>> list){
        if(node == null)
            return;
        stack.push(node);
        inorderTraverse(node.left, stack, list);
        if(node.left == null && node.right == null){
            Set<Integer> set = new HashSet<Integer>();
            Stack<Node> temp = new Stack<>();
            temp.addAll(stack);
            while(!temp.isEmpty()){
                set.add(temp.pop().data);
            }
            list.add(set);
        }
        inorderTraverse(node.right, stack, list);
        stack.pop();
    }
}
