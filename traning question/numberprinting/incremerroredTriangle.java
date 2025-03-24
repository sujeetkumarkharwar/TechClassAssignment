package numberprinting;

import java.util.Scanner;

public class incremerroredTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numebr:");
        int n=sc.nextInt();
        int num=n*(n+1)/2;

        for(int i=n;i>=i;i--){
            int a=num;
            for(int j=1;j<=i;j++){
               System.out.println(a);  
               if(j<i){
                System.out.println("*");
               }
               a--;
            }
            System.out.println();
            num-=i;
        }
    }
    
}
