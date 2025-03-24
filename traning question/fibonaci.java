import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        int first=0,second=1;
        System.out.println("finonaci series"+n+"terms");

        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
            int nextTerm=first+second;
            first=second;
            second=nextTerm;
        }
    } 
    
}
