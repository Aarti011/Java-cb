// import java.util.*;

// class bst_ll {
// 	  static class TreeNode {
// 		  int val;
// 		  int node;
// 		 TreeNode left, right;
// 		  TreeNode(int val){
// 			  this.val=val;
// 		  } 
// 	    }
// 	    static class ListNode {
// 	        int val;
// 	        ListNode next;
// 	        ListNode(int val){
// 	        	this.val=val;
// 	        }
// 	    }
// 	    static ListNode head = null, tail = null;

// 	    public static void bstToList(TreeNode root) {
// 	        if (root == null) return;
// 	        bstToList(root.left);
// 	        ListNode node = new ListNode(root.val);
// 	        if (head == null) {
// 	            head = node;
// 	            tail = node;
// 	        } else {
// 	            tail.next = node;
// 	            tail = node;
// 	        }
// 	        bstToList(root.right);
// 	    }
// 	    public static void printList(ListNode node) {
// 	        while (node != null) {
// 	            System.out.print(node.val + " ");
// 	            node = node.next;
// 	        }
// 	    }
// 	    public static void main(String[] args) {
// 	        TreeNode root = new TreeNode(4);

// 	        root.left = new TreeNode(2);
// 	        root.right = new TreeNode(6);
// 	        root.left.left = new TreeNode(1);
// 	        root.left.right = new TreeNode(3);
// 	        root.right.left = new TreeNode(5);
// 	        root.right.right = new TreeNode(7);
// 	        bstToList(root);
// 	        printList(head);
// 	    }
// 	}















class bst_ll {
    static class TreeNode {
        int val;
        TreeNode left, right;
       
        TreeNode(int val) {
            this.val = val;
        }
    }

    static int count = 0;
    static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inOrder(root, k);
        return result;

    }

    private static void inOrder(TreeNode node, int k) {
        if (node == null) return;
        inOrder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inOrder(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 2;
        System.out.println(kthSmallest(root, k));

        TreeNode rootb= new TreeNode(6);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(1);

    }
}
