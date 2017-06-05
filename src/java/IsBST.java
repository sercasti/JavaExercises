public class IsBST {

	public static void main(String args[]) {
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);
		root.right.left = new Node(25);
		root.right.right = new Node(35);
		System.out.println("is Tree BST ?? " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static boolean isBST(Node root, int min, int max) {
		if (root == null)
			return true;

		if (root.value <= min || root.value >= max)
			return false;

		return (isBST(root.left, min, root.value) && isBST(root.right, root.value, max));
	}

}

class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}
