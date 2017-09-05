import javax.swing.tree.TreeNode;
import java.util.Enumeration;

/**
 * Created by jiayicheng on 17/8/1.
 */
public class Node implements TreeNode {
public int data;
    public Node right;
    public Node left;
    public Node(int n)
    {
        data=n;
    }
    @Override
    public TreeNode getChildAt(int childIndex) {
        return null;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public TreeNode getParent() {
        return null;
    }

    @Override
    public int getIndex(TreeNode node) {
        return 0;
    }

    @Override
    public boolean getAllowsChildren() {
        return false;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Enumeration children() {
        return null;
    }
}
