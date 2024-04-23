
package HomeWork.HomeWork12;

import java.util.*;

public class HomeWork12 {
	public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // house_i:[[house_j, w_ij], [house_k, w_ik],...[house_virtual, w_ii]]
        Map<Integer, List<int[]>> weightedGraph = new HashMap<>();
        // real house are numbered 1 -> n, plus '0' as the virtual house that connects 
        // to every house with weight being the cost of building a well inside of one house
        for (int[] pipe : pipes) {
            weightedGraph.computeIfAbsent(pipe[0], k -> new ArrayList<>()).add(new int[]{pipe[1], pipe[2]});
            weightedGraph.computeIfAbsent(pipe[1], k -> new ArrayList<>()).add(new int[]{pipe[0], pipe[2]});
        }

        weightedGraph.put(0, new ArrayList<>());
        for (int h = 1; h <= n; h++) {
            weightedGraph.computeIfAbsent(h, k -> new ArrayList<>()).add(new int[]{0, wells[h - 1]});
            weightedGraph.get(0).add(new int[]{h, wells[h - 1]});
        }

        // minHeap of [house_i, w_i]
        Queue<int[]> minHeap = new PriorityQueue<>((e1, e2) -> e1[1] - e2[1]);
        boolean[] included = new boolean[n + 1];
        int countVisited = 0;
        int minCost = 0;
        // pick a random starting house: 0
        minHeap.add(new int[2]);
        while (countVisited <= n && !minHeap.isEmpty()) {
            int[] edge = minHeap.remove();
            int h = edge[0], w = edge[1];
            if (!included[h]) {
                included[h] = true;
                countVisited++;
                minCost += w;
            } else {
                continue;
            }

            for (int[] neighbor : weightedGraph.get(h)) {
                if (!included[neighbor[0]]) {
                    minHeap.add(neighbor);
                }
            }
        }

        return minCost;
    }
    public static void main(String[] args) {
        
    }
}
