import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  base number");
        int base=sc.nextInt();
        System.out.println("enter the exponent:");
        int exp=sc.nextInt();
        long res=1;


        for(int i=1;i<=exp;i++){
            res*=base;
        }
        System.out.println(res);
    }
    
}
