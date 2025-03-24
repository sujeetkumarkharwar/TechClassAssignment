package numberprinting;

import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuber");
        int n=sc.nextInt();

        int sum=0;
        while(n!=0){
            int ld=n%10;//123%10
            sum+=ld;
            n=n/10;//123/10=12
            
        }
        System.out.println(sum);
    }
    
}
