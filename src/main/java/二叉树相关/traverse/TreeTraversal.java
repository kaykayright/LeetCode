package 二叉树相关.traverse;

/**
 * @author fmk
 * @date 2020/7/23 21:50
 */
public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(7);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        System.out.println(TreeNode.preOrderUnRecur(tree));
    }
}
