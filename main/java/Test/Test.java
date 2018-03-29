package Test;

import java.util.Scanner;
import java.util.Stack;

public class Test {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "if so, you already have a google account. you can sign in on the right.";
        StringBuffer sb = new StringBuffer();
        String[] str1 =  str.split("\\.");
        //System.out.println(str1.length);
        //System.out.println(str1[0]);
        //System.out.println(str1[1]);
        for(int i=0;i<str1.length;i++){
               char temp = str1[i].trim().charAt(0);
           // System.out.println(str1[1].trim().charAt(0));
               if(Character.isLowerCase(temp) && i==0){
                   sb.append(Character.toUpperCase(temp)+str1[i].trim().substring(1)+".");
               }else if(Character.isLowerCase(temp) && i>=1){
                   sb.append(" "+Character.toUpperCase(temp)+str1[i].trim().substring(1)+".");
               }else{
                   sb.append(str1[i]+".");
               }
        }

        System.out.println(sb.toString());

    }


}
