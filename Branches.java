/*if the tree has no nodes, it's height is -1. The size of a binary tree is the total number of nodes in that tree. The depth of a node is the number of edges in the path from the root node to that node. The depth of a binary tree is usually used to refer to the height of the tree.*/
/*cal the height of tree*/
public class Branches {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}

		public void setLeft(Node n) {
			left = n;
		}

		/* Function to set right node */
		public void setRight(Node n) {
			right = n;
		}

		/* Function to get left node */
		public Node getLeft() {
			return left;
		}

		/* Function to get right node */
		public Node getRight() {
			return right;
		}

		/* Function to set data to node */
		public void setData(int d) {
			data = d;
		}

		/* Function to get data from node */
		public int getData() {
			return data;
		}

	}

	static Node root;

	public static void insert(int data) {
		root = insert(root, data);
	}

	public Branches() {
		root = null;
	}

	public static Node insert(Node node, int data) {

		if (node == null)
			node = new Node(data);
		else {
			if (node.getRight() == null)
				node.right = insert(node.right, data);
			else
				node.left = insert(node.left, data);
		}
		return node;

	}

	public static int countNodes() {
		return getNodeCount(root);
	}

	static int getNodeCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getNodeCount(node.left) + getNodeCount(node.right);
	}

	public static int count(int[] tree) {
		if (tree.length == 0)
			throw new UnsupportedOperationException("Waiting to be implemented.");

		for (int i : tree) {
			insert(i);

		}
		return countNodes();

	}

	public static void main(String[] args) {
		System.out.println(Branches.count(new int[] { 1, 3, 1 }));
	}
}