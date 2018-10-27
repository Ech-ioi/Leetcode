import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class num67 {
    public static void main(String[] args){
        Solution67 solution67=new Solution67();
        System.out.println((solution67.addBinary("1100","1011")) );
//        System.out.println("123");
    }
}
class Solution67 {
    public String addBinary(String a, String b) {
        char[] arrayA=a.toCharArray();
        char[] arrayB=b.toCharArray();
        if(a==null||a.length()==0) return b;
        if(b==null||b.length()==0) return a;
        int aNum=a.length()-1;
        int bNum=b.length()-1;
        int carry=0;
        String result="";
        while(aNum>=0||bNum>=0||carry==1){
            int numA=0;
            int numB=0;
            if(aNum>=0) numA=Character.getNumericValue(arrayA[aNum]);
            if(bNum>=0) numB=Character.getNumericValue(arrayB[bNum]);
            aNum--;
            bNum--;
            int num=numA+numB+carry;
            carry=num/2;
            result=Integer.toString(num%2)+result;




        }
        return  result;


    }
}