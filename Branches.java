/*cal the leaf node height*/
public class Branches {
	class Node  
	{ 
	    int data; 
	    Node left, right; 
	   
	    public Node(int item)  
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	} 
	
	Node root; 
    
   
    int getLeafCount(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        else
            return getLeafCount(node.left) + getLeafCount(node.right); 
    } 
    
    
    public static int count(int[] tree) {
    	if(tree.length==0)
        throw new UnsupportedOperationException("Waiting to be implemented.");
    	
    	return getLeafCount(root); 
    	return 0;
    }

    public static void main(String[] args) {
        System.out.println(Branches.count(new int[] { 1, 3, 1, -1, 3 }));
    }
}