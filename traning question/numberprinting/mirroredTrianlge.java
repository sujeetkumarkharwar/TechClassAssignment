package numberprinting;

import java.util.Scanner;

public class mirroredTrianlge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int a=10;

        for(int i=1;i<n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print(a+"*");
                a--;
            }
            System.out.println(a++);
        }
    }
    
}
