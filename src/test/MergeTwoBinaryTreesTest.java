import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {

    @Test
    public void testMergeTwoBinaryTrees(){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode tm = new TreeNode(3);
        tm.left = new TreeNode(4);
        tm.right = new TreeNode(5);
        tm.left.left = new TreeNode(5);
        tm.left.right = new TreeNode(4);
        tm.right.right = new TreeNode(7);

        TreeNode tmm = MergeTwoBinaryTrees.mergeTrees(t1, t2);
        assertEquals(tm.val, tmm.val);
        assertEquals(tm.left.val, tmm.left.val);
        assertEquals(tm.left.left.val, tmm.left.left.val);
        assertEquals(tm.left.right.val, tmm.left.right.val);
        assertEquals(tm.right.val, tmm.right.val);
        assertEquals(tm.right.right.val, tmm.right.right.val);
    }


}