package numberprinting;

import java.util.Scanner;

public class incrementingTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the nuber");
        int n=sc.nextInt();
        
        int a=6;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n+1-i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
            a-=1;
        }
    }
    
}
