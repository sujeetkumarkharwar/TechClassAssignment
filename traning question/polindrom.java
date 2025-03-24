import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int x=0;
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev*=10+ld;
            n=n/10;

        }
        if(x==n){
            System.out.println(n+" polindrome");
        }else{
            System.out.println(n+" is not polindrome");
        }
    }
    
}
