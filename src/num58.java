public class num58 {
    public static void main(String[] args){
        Solution58 solution58=new Solution58();
        System.out.println(solution58.lengthOfLastWord("a  "));
    }
}
class Solution58 {
    public int lengthOfLastWord(String s) {
        if(s==null||s.isEmpty()) return 0;
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                result=result+(String.valueOf(s.charAt(i)));
            else if(result.isEmpty()) continue;
            else break;
        }
        return result.length();
    }
}