import java.util.Scanner;

public class sumOfGivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number;");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    
}
