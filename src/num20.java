import java.util.HashMap;
import java.util.Map;

class Solution20 {
    private Map<Character,Integer> map;

    public Solution20(){
        map=new HashMap<>();
        map.put('(',0);
        map.put(')',0);
        map.put('[',1);
        map.put(']',1);
        map.put('{',2);
        map.put('}',2);
    }
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        Map<Integer,Character> stringMap=new HashMap<>();
        int k=0;
        stringMap.put(k++,s.charAt(0));
        for(int i=1;i<s.length();i++){
            stringMap.put(k++,s.charAt(i));
            if(k==1) continue;
            if(stringMap.get(k-2).equals(stringMap.get(k-1))) continue;
            else if(map.get(stringMap.get(k-2)).equals(map.get(stringMap.get(k-1)))){
                stringMap.remove(k-1);
                stringMap.remove(k-2);
                k=k-2;
            }
        }
        if(stringMap.isEmpty()) return true;
        else return false;
    }

}


public class num20 {
    public static void main(String[] args){
        Solution20 solution20=new Solution20();
        System.out.println(solution20.isValid("[]{}()"));
    }
}
