package ooplab3;

import java.util.Scanner;

public class TestWhileLoop {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i++<=100) {
            if (i%3==0&&i%5==0)
                System.out.print(i+" ");
            i++;

        }//while
        //do-while
        System.out.println();
        int j = 1;
        do {
            if (i % 3 == 0 && 5 == 0)
                System.out.print(j + " ");
        }while (++j<=100);
    }

    //0-49  = F
    //50-59 = D
    //60-69 = C
    //70-79 = B
    //80-100    = A
    public static class CalGrade {
        public static void main(String[] args ){
            //Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Input your score : ");
            int Score = scanner.nextInt();
            //test condition
            if(Score <= 49)
                System.out.println("Your grade is F");

            else if(Score <= 59)
                System.out.println("Your grade is D");

            else if(Score <= 69)
                System.out.println("Your grade is C");
            else if(Score <= 79)
                System.out.println("Your grade is B");

            else
                System.out.println("Your grade is A");

        }//main
    }//class
}
