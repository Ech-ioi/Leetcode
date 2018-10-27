import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution7 {
    public int reverse(int x) {
        int flag=1;
        if(x<0){
            x=-x;
            flag=-1;
        }
        int temp=0;
        int pop;
        while(x!=0){
            pop=x%10;
            x=x/10;
            if(temp>Integer.MAX_VALUE/10||(temp==Integer.MAX_VALUE/10&&pop>7)) return 0;
            if(temp<Integer.MIN_VALUE/10||(temp==Integer.MIN_VALUE/10&&pop<-8)) return 0;
            temp=temp*10+pop;
        }
        return temp*flag;
    }
}

public class num7 {
    public static void main(String[] args){
        Solution7 solution=new Solution7();
        Scanner sc=new Scanner(System.in);
        int result,input;
        while(sc.hasNext()){
            try{
                input=sc.nextInt();
                result=solution.reverse(input);
                System.out.println("结果为"+result+"\n");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.print("请输入一个整数");
                break;
            }

        }

    }
}