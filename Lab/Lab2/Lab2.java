package Lab.Lab2;
import java.util.*;
public class Lab2 {
    public static void main(String[] args){
        String s = "hello";
        String t = "olehl";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), 1 + map.getOrDefault(s.charAt(i),0));
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1 );
        }
        Collection<Integer> coll = map.values();
        for(int i : coll){
            //System.out.println(i);
             if(i != 0){
                return false;
            }
        }
        return true;
    }
}
