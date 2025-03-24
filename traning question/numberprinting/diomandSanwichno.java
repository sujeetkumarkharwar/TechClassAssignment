package numberprinting;

import java.util.Scanner;

public class diomandSanwichno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the nuber");
        int n=sc.nextInt();
        
        int a=4;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n+1-i;j++){
                System.out.print(a+" *");
            }
            System.out.println();
            a-=1;
        }
        int b=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(b+" *");
            }
            System.out.println();
            b+=1;
        }
    }
    
}
