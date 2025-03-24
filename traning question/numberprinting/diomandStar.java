package numberprinting;

import java.util.Scanner;

public class diomandStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuber:");
        int n=sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+1);
                if(j<i){
                    System.out.print(" *" );
                // }else{
                //     System.out.print(j+ " ");
                 }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+1);
                if(j<i){
                    System.out.print(" *" );
                // }else{
                //     System.out.print(j+ " ");
                 }
            }
            System.out.println();
        }
    }
    
}
