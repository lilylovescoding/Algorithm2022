package Finalexam;

/**
 分两步计算：
 1）先找LCA
 2）dist（node1-LCA）+dist（node2+LCA）
 */

class BSTNode{
    int val;
    BSTNode left;
    BSTNode right;
    public BSTNode(int val){
        this.val=val;
    }
}
public class Q2_DistanceBetweenTwoNodeInBST {
    public static void main(String[] args){
        Integer[]BST={15,5,20,3,10,1,4,8,7,9};
        int node1 = 3;
        int node2 = 1;
        int dis=distance(BST,node1,node2);
        System.out.println(node1+"节点和"+node2+"节点之间的距离是："+dis);
    }
    public static int distance(Integer[]BST,int node1,int node2){
        BSTNode root=new BSTNode(BST[0]);
        for (int i=1;i<BST.length;i++){
            constructBst(root,BST[i]);
        }
        return findDis(root,node1,node2);
    }
    public static void constructBst(BSTNode root,int cur){
        if(cur>root.val){
            if(root.right==null){
                root.right=new BSTNode(cur);
            }else{
                constructBst(root.right,cur);
            }
        }else{
            if(root.left==null){
                root.left=new BSTNode(cur);
            }else{
                constructBst(root.left,cur);
            }
        }
    }
    public static int findDis(BSTNode root,int node1,int node2){
        BSTNode LCA=findLCA(root,node1,node2);
        if(LCA==null){
            return -1;
        }else{
            return findNumIfLevel(LCA,node1)+findNumIfLevel(LCA,node2);
        }
    }
    public static BSTNode findLCA(BSTNode root,int node1,int node2){

        if(root==null){
            return null;
        }
        if((node1>root.val)&&(node2>root.val)){
            return findLCA(root.right,node1,node2);
        }else if((node1<root.val)&&(node2<root.val)){
            return findLCA(root.left,node1,node2);
        }else {
            return root;
        }
    }
    public static int findNumIfLevel(BSTNode root,int node){
        if(root==null){
            return -1;
        }
        if(root.val==node){
            return 0;
        }
        if(node> root.val){
            return findNumIfLevel(root.right,node)+1;
        }else {
            return findNumIfLevel(root.left,node)+1;
        }
    }
}
