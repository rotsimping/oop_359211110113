package ooplat5;

import java.util.Scanner;

public class InputDatatoArray {
    private static int MAX = 5;
  public static void main(String[] args){
        int number[] =new int[MAX];
        System.out.println(number.length);
        //for
        number = inputData(number);
            showData(number);
            showDataEnchance(number);

    }//main
    private static int[] inputData(int[] number){
        System.out.println("Data in Array: ");
        for (int val:number)
            System.out.println(val+" ");

        }

    private static int[] inputData(int[] number){
        System.out.println("Data in Array: ");
        for (int i=0;i<number.length;i++)
            System.out.println(number[i]+" ");

        return number;



    }
}//class
