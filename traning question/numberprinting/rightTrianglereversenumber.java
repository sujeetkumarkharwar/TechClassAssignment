package numberprinting;

import java.util.Scanner;

public class rightTrianglereversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the number:");
        int n=sc.nextInt();


        int a=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(a+" ");
                a-=1;
            }
            System.out.println();
        }
    }
    
}
