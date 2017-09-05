import javax.swing.tree.TreeNode;

/**
 * Created by jiayicheng on 17/8/1.
 */
public class Minimal_Tree {

    Node createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    Node createMinimalBST(int array[], int start, int end)
    {
        if(end<start)
            return null;

        int mid=(start+end)/2;
        Node a=new Node(array[mid]);

        a.left=createMinimalBST(array,start,mid-1);
        a.right=createMinimalBST(array,mid+1,end);
        return a;
    }
}
