package Practice_7_Binary_Trees_1;
import java.util.*;

public class ContructorTreeByLevelOrder{

    public static void main(String[] args){
        Integer[]array={1,11,2,-14,-6};
        System.out.println(Arrays.toString(array));
        TreeNode a=constructTree(array);
        //System.out.println(a.left.left.key);
//        boolean t=checkBalanced(a);
//        System.out.println(t);
        preOrderbyIterators(a);
        preOrder(a);
        inOrder(a);
        postOrder(a);
        TreeNode searchResult=search(a,4);
        System.out.println(searchResult);

        int p=Maxpath(a);
        System.out.println("1：叶子到叶子最大值"+p);

        int r=Maxsubpath(a);
        System.out.println("根到叶子最大值"+r);

        int e=MathNodepath(a);
        System.out.println("任意节点到任意节点最大的值 "+e);

        int sum=Mathsum(a);
        System.out.println("所有节点之和： "+sum);


    }
    public static int Maxpath(TreeNode a){
        if(a==null){
            return 0;
        }
        int[]global=new int[]{Integer.MIN_VALUE};
        int k = helper(a,global);
        System.out.println("1：最终返回值的根节点值为： "+k);
        return global[0];
    }
    public static int helper(TreeNode a, int[]global){
        if(a==null){
            return 0;
        }
        int leftsum=helper(a.left,global);
        int rightsum=helper(a.right,global);
        if(a.left==null||a.right==null){
            return a.key+leftsum+rightsum;
        }
        //int curMax=a.key+leftsum+rightsum;
        //global[0]=global[0]<curMax?curMax:global[0];
        global[0]=Math.max(global[0],a.key+leftsum+rightsum);  //记录当前一个完整的 leaf 到 leaf 路径，更新最大值
        return a.key+Math.max(leftsum,rightsum);
    }
    public static int Maxsubpath(TreeNode a){
        int[]max=new int[]{Integer.MIN_VALUE};
        helper_2(a,max);
        return max[0];
    }
    private static int helper_2(TreeNode a,int[]max){
        if(a==null){
            return 0;
        }
        int left=helper_2(a.left,max);
        int right=helper_2(a.right,max);
        int sin=Math.max(Math.max(left,right),0)+a.key;
        max[0]=Math.max(sin,max[0]);
        return sin;
    }

    public static int MathNodepath(TreeNode a){
        int[]max=new int[]{Integer.MIN_VALUE};
        helper_3(a,max);
        return max[0];
    }
    private static int helper_3(TreeNode a,int[] max){
        //base case
        if(a==null){
            return 0;
        }
        int leftsum=helper_3(a.left,max);
        int rightsum=helper_3(a.right,max);
        leftsum=leftsum<0?0:leftsum;
        rightsum=rightsum<0?0:rightsum;
        max[0]=Math.max(max[0],a.key+leftsum+rightsum);
        return a.key+Math.max(leftsum,rightsum);
    }

    public static int Mathsum(TreeNode a){
        int sum=helper_4(a);
        return sum;
    }
    private static int helper_4(TreeNode a){
        //base case
        if(a==null){
            return 0;
        }
        int leftsum=helper_4(a.left);
        int righrsum=helper_4(a.right);
        int sum=a.key+leftsum+righrsum;
        return sum;
    }


    public static TreeNode constructTree(Integer[]array){
        if(array.length==0){
            return null;
        }
        TreeNode root=new TreeNode(array[0]);
        int index=0;
        return constructTree(array,root,index);
    }
    public static TreeNode constructTree(Integer[]array,TreeNode root,int index){
       if(index<array.length){
           if(array[index]==null){
               return null;
           }
           root=new TreeNode(array[index]);
           root.left=constructTree(array,null,2*index+1);
           root.right=constructTree(array,null,2*index+2);
       }
       return root;
    }

    public static boolean checkBalanced(TreeNode a){


        return true;
    }
    public static TreeNode search(TreeNode root,int target){
        if(root==null||root.key==target){
            return root;
        }

        return null;
    }
    public static TreeNode preOrderbyIterators(TreeNode root){

        if(root==null){
            return null;
        }
        Deque<TreeNode> stack=new ArrayDeque<TreeNode>(); //build a new null stack of linkedlist
        stack.offerFirst(root);                           //put likedlist root node into new stack
        while (!stack.isEmpty()){
            TreeNode cur=stack.pollFirst();
            System.out.print(cur.key);
            if(cur.right!=null){
                stack.offerFirst(cur.right);               //put cur.right into the new stack
            }
            if(cur.left!=null){
                stack.offerFirst(cur.left);                 //put cur,left into the new stack
            }
        }
        System.out.println();
        return root;
    }
    public static void preOrder(TreeNode root){
        List<Integer> preOrder=new ArrayList<Integer>();
        if(root==null);{
            System.out.println();
        }
        Deque<TreeNode> stack=new LinkedList<TreeNode>();
        stack.offerFirst(root);
        while (!stack.isEmpty()){
            TreeNode cur=stack.pollFirst();
            if(cur.right!=null){
                stack.offerFirst(cur.right);
            }
            if(cur.left!=null){
                stack.offerFirst(cur.left);
            }
            preOrder.add(cur.key);
        }
        System.out.println(preOrder);
    }
    public static void inOrder(TreeNode root){
        List<Integer>inOrder=new ArrayList<Integer>();
        if(root==null){
            System.out.println();
        }
        Deque<TreeNode>stack=new ArrayDeque<TreeNode>();
        TreeNode helper=root;
        while(helper!=null||!stack.isEmpty()){
            if(helper!=null){
                stack.offerFirst(helper);
                helper=helper.left;
            }else{
                helper=stack.pollFirst();
                inOrder.add(helper.key);
                helper=helper.right;
            }
        }
        System.out.println(inOrder);
    }
    public static void postOrder(TreeNode root){
        List<Integer>postOrder=new ArrayList<Integer>();
        if(root==null){
            System.out.println();
        }
        Deque<TreeNode>stack=new ArrayDeque<TreeNode>();
        TreeNode pre=null;
        stack.offerFirst(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.peekFirst();
            if(pre==null||cur==pre.left||cur==pre.right){
                if(cur.left!=null){
                    stack.offerFirst(cur.left);
                }else if(cur.right!=null){
                    stack.offerFirst(cur.right);
                }else{
                    postOrder.add(cur.key);
                    stack.pollFirst();
                }
            }else if(pre==cur.left){
                if(cur.right!=null){
                    stack.offerFirst(cur.right);
                }else {
                    postOrder.add(cur.key);
                    stack.pollFirst();
                }
            }else {
                postOrder.add(cur.key);
                stack.pollFirst();
            }
            pre=cur;
        }
        System.out.println(postOrder);
    }
}

