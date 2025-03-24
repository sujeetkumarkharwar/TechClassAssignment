package numberprinting;

import java.util.Scanner;

public class initialied3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuber :");
        int n=sc.nextInt();

         
        // for(int i=2;i<=n;i++){
        //     // int a=3;
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(i+" ");
        //         // a+=1;
        //     }
        //     System.out.println();
        // }
        for(int i=n;i>=1;i--){
            // int a=3;
            for(int j=1;j<=n+1-i;j++){
                System.out.print(i+" ");//pending 2334445555,5555444332
                // a+=1;
            }
            System.out.println();
        }
    }
    
}
