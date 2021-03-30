package Tree;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        /*
                            3
                    9               20
              N           N  15             7
        */

        TreeNode tree = new TreeNode(
                3,
                new TreeNode(
                        9,
                        null,
                        null
                ),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        System.out.println(minDepth(tree));
        //  2
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        return height(root);
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        else if (root.left == null || root.right == null)
            return 1 + Math.max(height(root.left), height(root.right));
        else
            return 1 + Math.min(height(root.left), height(root.right));
    }
}