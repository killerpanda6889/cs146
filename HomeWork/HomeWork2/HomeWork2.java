package HomeWork.HomeWork2;

public class HomeWork2{
    public static void main(String[] args){
        System.out.println(firstBadVersion(10));
    }
    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(true){
            int mid = low + ( high - low ) / 2;
             if(isBadVersion(mid) && !isBadVersion(mid-1)){
                 System.out.println("found");
                 return mid;
                 
             }else if(!isBadVersion(mid)){
                 System.out.println("oo low" + mid);
                 low = mid+1;
             }else{
                 System.out.println("too high" + mid);
                 high = mid;
             }
        }

     }
     public static boolean isBadVersion(int num){
        // 6 represents first bad version
        return num >= 6;
     }
}