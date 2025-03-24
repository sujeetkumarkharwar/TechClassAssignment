package patternprint;

import java.util.Scanner;

public class rectangleStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the row:");
        int n=sc.nextInt();
        System.out.println("enter the colunm:");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
