package numberprinting;

import java.util.Scanner;

public class numberHalfDioman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuber");
        int n=sc.nextInt();
        int a=4;


        for(int i=1;i<=n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print(a+" *");
            }
            System.out.println(a--);
        }
        int b=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b+"* ");
                
            }
            System.out.println(b++);
        }
    }
    
}
