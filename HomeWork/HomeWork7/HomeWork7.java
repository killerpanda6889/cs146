package HomeWork.HomeWork7;

import java.util.*;

public class HomeWork7{
    public static int minMeetingRooms(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); // Key --> Minute Value --> meetings at minute
        for(int i = 0; i < intervals.length; i++){
            for(int x = intervals[i][0]; x < intervals[i][1]; x++){
                map.put(x, map.getOrDefault(x,0) + 1);
            }
        }
        return Collections.max(map.values());
    }
    public static void main(String[] args) {
        int[][] mat = {{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(mat));
    }

}