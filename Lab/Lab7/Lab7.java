public class Lab7{
    public static void main(String[] args) {
        int n = 5;
        int[][]edges = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int distanceThreshold = 2;
        System.out.println(findTheCity(n, edges, distanceThreshold));
    }
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[i].length; j++) {
               dist[i][j] = Integer.MAX_VALUE/2;
            }
        }
        for(int[] edge : edges){
            dist[edge[0]][edge[1]] =  edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }
    
        for(int k = 0;  k < n; k++){
            for(int i = 0;  i < n; i++){
                for(int j = 0;  j < n; j++){
                    if(dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                        //System.out.println(i + " "+ j + " "+ dist[i][j]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }
        //printMatrix(dist);
        int min = n+1;
        int maxInd = -1;
        
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(dist[i][j] <= distanceThreshold){
                    count++;
                }
            }
            if(count < min){
                min = count;
                maxInd = i;
                //System.out.println(count);
            }
        }
        return maxInd;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}