package HomeWork.HomeWork11;
import java.util.LinkedList;
import java.util.Queue;

public class HomeWork11{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        while(q.peek() != null){
            int[] currentNode = q.remove();
            int xpos = currentNode[0];
            int ypos = currentNode[1];
            if(xpos >= 0 && ypos >= 0 && xpos < image.length && ypos < image[0].length && image[xpos][ypos] == startColor && image[xpos][ypos] != color){
                image[xpos][ypos] = color;
                q.add(new int[]{xpos-1, ypos});
                q.add(new int[]{xpos+1, ypos});
                q.add(new int[]{xpos, ypos-1});
                q.add(new int[]{xpos, ypos+1});
            }
        }
        return image;
    }
    // public static void main(String[] args){
    //     int[][] image = {
    //         {1, 1, 1, 1},
    //         {1, 1, 0, 0},
    //         {1, 0, 1, 0},
    //         {1, 0, 0, 1}
    //     };

    //     int sr = 1; // Starting row
    //     int sc = 1; // Starting column
    //     int color = 2; // Color to fill
        

    // }
}