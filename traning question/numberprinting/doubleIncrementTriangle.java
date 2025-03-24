package numberprinting;

import java.util.Scanner;

public class doubleIncrementTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enyer the nuber:");
        int n=sc.nextInt();


        int a=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
        }
    }
    
}
