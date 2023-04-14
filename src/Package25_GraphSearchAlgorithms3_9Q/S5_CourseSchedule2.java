package Package25_GraphSearchAlgorithms3_9Q;

import java.util.ArrayList;
import java.util.List;

public class S5_CourseSchedule2 {
    public static void main(String[] args){
        List<List<Integer>> graph=new ArrayList<>();
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>());
        System.out.println(graph);

        graph.get(0).add(1);
        graph.get(0).add(1);
        System.out.println(graph);

        graph.get(1).add(2);
        graph.get(1).add(2);
        System.out.println(graph);


    }
}
