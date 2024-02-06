package HomeWork.HomeWork1;

class HomeWork1{
    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int lower = 0;
        int upper = s.length()-1;
        while(lower < upper){
            if(! validLetter(s.charAt(lower))){
                lower++;
                continue;
            }else if (!validLetter(s.charAt(upper))){
                upper--;
                continue;
            }
            if(s.charAt(lower) != s.charAt(upper)){
                System.out.println(s.charAt(lower) + " is not " + s.charAt(upper));
                return false;
            }else{
                lower++;
                upper--;
            }
        }
        return true;
    }
    public static boolean validLetter(Character c){
        return (c >= 97 && c <= 122) || (c >= 48 && c <= 57);
    }
}
