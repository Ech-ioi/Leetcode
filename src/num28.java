public class num28 {
    public static void main(String[] args){
        Solution28 solution28=new Solution28();
        System.out.println(solution28.strStr("a","a"));
    }
}
class Solution28 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        else if(haystack.isEmpty()||haystack.length()<needle.length()) return -1;
        for(int i=0;i<haystack.length();i++){
            int index=i;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(index)==needle.charAt(j)){
                    if(i+needle.length()>haystack.length()) return -1;
                    index++;
                }
                else break;
                if(j==needle.length()-1) return i;
            }
        }
        return -1;
    }
}