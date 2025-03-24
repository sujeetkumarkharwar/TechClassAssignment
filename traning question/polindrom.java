import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int x=n;
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;

        }
        if(rev==x){
            System.out.println(x+" polindrome");
        }else{
            System.out.println(x+" is not polindrome");
        }
    }
    
}
