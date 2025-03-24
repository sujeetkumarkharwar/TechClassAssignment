package numberprinting;

import java.util.Scanner;

public class rhombusStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and colunm:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");
                
            }
            System.out.println("");
        }
        
    }
    
}
