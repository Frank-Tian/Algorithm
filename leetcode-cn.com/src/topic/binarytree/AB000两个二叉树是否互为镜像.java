package topic.binarytree;

import base.TreeNode;

public class AB000两个二叉树是否互为镜像 {
	boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		if (t1.val != t2.val) {
			return false;
		}
		return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}
}
