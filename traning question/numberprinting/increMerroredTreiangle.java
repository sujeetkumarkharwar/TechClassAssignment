package numberprinting;

import java.util.Scanner;

public class increMerroredTreiangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        // int n=4;
        int num=1;


       
        for(int i=1;i<=n;i++){
            int a=num;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                if(j<i){
                    System.out.print("*");
                    
                }
                a--;
            }
            System.out.println();
            num+=i+1;
            
        }
    }
    
}
