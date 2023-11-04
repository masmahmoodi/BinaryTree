// Go down to find main class 
public class BinaryTreeOperation {

  // inner class for creating nodes   
  public static  class Node{
        
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
        
        
    }
    
  
  //inner class for creating BinaryTree
   public static class BinaryTree{
       static int index  =-1;
       public static Node buildTree(int a[]){
           index ++;
           if(a[index] == -1){
               return null;
           }
           
           Node newNode = new Node(a[index]);
           newNode.left= buildTree(a);
           newNode.right = buildTree(a);
           
           
           return newNode;
       }
   }
   
   
   //pre order 
   public static void preOrder(Node root){
       if(root == null){
           System.out.print("-1 ");
           return;
       }
       
       System.out.print(root.data+" ");
       preOrder(root.left);
       preOrder(root.right);
               
   }
   
   // post order 
   public static void postOrder(Node root){
       if(root == null){
           System.out.print("-1 ");
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data+" ");
       
   }
   
   
   //in order 
   public static void inOrder(Node root){
       if(root == null){
           System.out.print("-1 ");
           return ;
       }
       inOrder(root.left);
       System.out.print( root.data+" ");
       inOrder(root.right);
   }
   
   
   
   // count of nodes
   public static int countsOfNodes(Node root){
       if(root == null){
           return 0;
       }
       int leftCountNode = countsOfNodes(root.left);
       int rightCountNode = countsOfNodes(root.right);
       return leftCountNode+rightCountNode+1;
   }
   
   //sum of nodes 
   public static int sumOfNodes(Node root){
       if(root == null){
           return 0;
       }
       int rightSum = sumOfNodes(root.right);
       int leftSum = sumOfNodes(root.left);
       return rightSum+leftSum+root.data;
   }
   
   
   
   //higth of nodes
   public static int height(Node root ){
       if(root == null){
           return 0;
       }
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       
       int maxHeigth =Math.max(leftHeight,rightHeight)+1;
       return maxHeigth;
   }
   
   
   // diameter 
   public static int diameter(Node root){
       if(root == null){
           return 0;
       }
       int diameter1 = diameter(root.left);
       int diameter2 = diameter(root.right);
       int diameter3 = height(root.left)+height(root.right)+1;
       return Math.max(diameter3,Math.max(diameter1,diameter2));
   }
   
    public static void main(String[] args) {
      
              // run your code here !
        
        
        
//        int a[] = {4,3,1,-1,-1,4,-1,-1,5,4,-1,-1,-1};
//        BinaryTree bt = new BinaryTree();
//        Node root = bt.buildTree(a);

        
        
        
    }
    
}
