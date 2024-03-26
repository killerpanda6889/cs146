package Lab.Lab6;

import java.util.*;

public class Lab6{
    public static void main(String[] args) {
        int[][] array = {
            {0, 1},
            {1, 0}
        };
        
        
        System.out.println(canFinish(3, array));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(i , new ArrayList<Integer>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            if(prerequisites[i][0] == prerequisites[i][1]){
                return false; // A course that points to itself
            }
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        int processed = 0;
        while(processed != numCourses){
            for(int i = 0; i < graph.size(); i++){
                if(graph.get(i).size() == 0){
                    q.add(i);
                }
            }
            if(q.isEmpty()){
                return false; //cycle detected
            }
            while(!q.isEmpty()){
                Integer curr = q.poll();
                graph.get(curr).add(numCourses+1);
                processed++;
                System.out.println(curr + " " + processed);
                for(int i = 0; i < graph.size(); i++){
                    for(int j = 0; j < graph.get(i).size(); j++){
                        if(graph.get(i).get(j) == curr){
                            graph.get(i).remove(j);
                        }
                    }
                    
                }
            }
        }
        return true;
    }
}