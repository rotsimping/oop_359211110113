package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//      StringTokenizer
        String msg = "Hello Welcom MT RMTUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //countToken()
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreElements()){
            StringBuffer buffer = new StringBuffer(myToken.nextToken());
            System.out.println(buffer.reverse()+" ");
        }//while


    }//main
}//class
