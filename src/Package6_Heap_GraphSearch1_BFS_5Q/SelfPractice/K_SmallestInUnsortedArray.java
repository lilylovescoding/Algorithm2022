package Package6_Heap_GraphSearch1_BFS_5Q.SelfPractice;
import java.util.*;

class TreeNode2{
    int key;
    TreeNode2 left;
    TreeNode2 right;
    public TreeNode2(int key){
        this.key=key;
    }
}

public class K_SmallestInUnsortedArray {
    public static void main(String[] args){
        Integer[]array={3,4,7,2,4,6,7,1};
        int k=4;
        int[] sort=K_sorting(array,k);
        System.out.println("K_sorting : "+Arrays.toString(sort));
        TreeNode2 a=constructTree(array);
        System.out.println("root.right.left : "+a.right.left.key);
        List<List<Integer>> b=LayerByLayer(a);
        System.out.println("LayerByLayer : "+b);
        boolean t=checkCompleted(a);
        System.out.println("this CBT is : "+t);

    }
    public static int[] K_sorting(Integer[] array, int k){
        if(array.length==0||k==0){
            return new int[0];
        }
        //这是一个comparator的比较器
        PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(k, new Comparator<Integer>() {  //匿名内部类 ：construct k size maxHeap
            @Override
            public int compare(Integer o1, Integer o2) {        //compare current value & root;
                if(o1.equals(o2)){                              //if current.value>=root.value,continue
                    return 0;            //o1和o2优先级相同       //if current.valur<root.value -->
                }
                return o1>o2?-1:1;       //return-1当前o1优先级更高  return1当前o1更低
            }
        });
        for(int i=0;i<array.length;i++){
            if(i<k){
                maxheap.offer(array[i]);
            }else if(array[i]<maxheap.peek()){
                maxheap.poll();
                maxheap.offer(array[i]);
            }
        }
        int[]result=new int[k];             //从大到小放置 升序放置
        for(int i=k-1;i>=0;i--){
            result[i]=maxheap.poll();       //从后往前拿
        }
        return result;   //TC:nlogn+klogk 
    }
    public static TreeNode2 constructTree(Integer[]array){
        if(array.length==0){
            return null;
        }
        TreeNode2 root=new TreeNode2(array[0]);
        int index=0;
        return constructTree(array,root,index);
    }
    public static TreeNode2 constructTree(Integer[]array,TreeNode2 root,int index){
        if(index<array.length){
            if(array[index]==null){
                return null;
            }
            root=new TreeNode2(array[index]);
            root.left=constructTree(array,null,2*index+1);
            root.right=constructTree(array,null,2*index+2);

        }
        return root;
    }
    public static List<List<Integer>> LayerByLayer(TreeNode2 a){
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(a==null){
            return list;
        }
        Queue<TreeNode2>queue=new LinkedList<TreeNode2>();
        queue.offer(a);
        while (!queue.isEmpty()){
            List<Integer>curLayer=new ArrayList<Integer>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode2 cur=queue.poll();
                curLayer.add(cur.key);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            list.add(curLayer);
        }
        return list;
    }
    public static boolean checkCompleted(TreeNode2 a){
        if(a==null){
            return true;
        }
        Queue<TreeNode2> queue=new LinkedList<TreeNode2>();
        boolean flag=false;                 //there is no bubble
        queue.offer(a);
        while(!queue.isEmpty()){
            TreeNode2 cur=queue.poll();
            if(cur.left==null){           //cur.left not a null
                flag=true;                //cur.left is a bubble
            }else if(flag){
                return false;
            }else{
                queue.offer(cur.left);
            }
            if(cur.right==null){          //cur.right not a null
                flag=true;                //cur.right is a bubble
            }else if(flag){
                return false;
            }else{
                queue.offer(cur.right);
            }
        }
        return true;
    }

}
