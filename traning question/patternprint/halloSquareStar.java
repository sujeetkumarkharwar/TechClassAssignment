package patternprint;

import java.util.Scanner;

public class halloSquareStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int n=sc.nextInt();
        System.out.println("enter the colunm:");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                 if(i+j>6 && i!=j ){
                    System.out.print("*");
                 }
            }
            System.out.println();
        }
    }
    
}
