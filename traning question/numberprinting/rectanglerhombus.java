package numberprinting;

import java.util.Scanner;

public class rectanglerhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number row colunm:");
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
