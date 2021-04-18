package topic.binarytree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

public class LC145_二叉树的后序遍历 {
	private List<Integer> list = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		list.add(root.val);
		return list;
	}

}

class NC_实现二叉树先序_中序和后序遍历 {
	int index1 = 0;
	int index2 = 0;
	int index3 = 0;

	int getTreeSize(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + getTreeSize(root.left) + getTreeSize(root.right);
	}

	public int[][] threeOrders(TreeNode root) {
		int size = getTreeSize(root); // 求总节点数
		int[][] res = new int[3][size];
		treeOrder(res, root); // 递归
		return res;
	}

	void treeOrder(int[][] res, TreeNode root) {
		if (root == null) {
			return;
		}
		res[0][index1++] = root.val; // 前序
		treeOrder(res, root.left);
		res[1][index2++] = root.val; // 中序
		treeOrder(res, root.right);
		res[2][index3++] = root.val; // 后序
	}
}