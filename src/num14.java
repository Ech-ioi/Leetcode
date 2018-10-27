import java.util.Arrays;

//class Solution14 {
//    public String longestCommonPrefix(String[] strs) {
//        String s=strs[0];
//        char c1[]=s.toCharArray();
//        int find[][]=new int[strs.length][s.length()];
//        Arrays.fill(find,1);
//        int num[][]=new int[strs.length-1][];
//        for(int i=1;i<strs.length;i++){
//            char c2[]=strs[i].toCharArray();
//            for(int j=0;j<s.length()&&j<strs[i].length();j++){
//                find[i][j]=c1[j]-c2[j];
//            }
//        }
//        for(int i=0;i<strs.length;i++){
//            System.out.println(Arrays.toString(find[i]));
//        }
//        return "";
//    }
//}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);//找到和当前串匹配的prefix前缀
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix ;
    }
}

public class num14 {
    public static void main(String[] args){
        Solution14 solution14=new Solution14();
        String[] strs={"flower","flow","floight"};
        System.out.println(solution14.longestCommonPrefix(strs));
    }
}
