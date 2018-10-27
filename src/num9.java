import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        Map<Integer,Integer> map=new HashMap<>();
        int i=1;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            map.put(i++,pop);
        }
        int n=i-1;
        for(int k=0;k<=n/2;k++){
            if(map.get(k)!=map.get(n-k+1))
                return false;
        }
        return true;
    }
}
public class num9 {
    public static void main(String[] args){
        Solution9 solution=new Solution9();
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            boolean result=solution.isPalindrome(scanner.nextInt());
            System.out.println(result);
        }
    }
}
