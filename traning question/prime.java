import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;

        }else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }if(isPrime){
                System.out.println("it is prime number");
            }else{
                System.out.println("it is not prime number");
            }
        }
        // }if(isPrime){
        //     System.out.println("it is prime number");
        // }else{
        //     System.out.println("it is not prime number");
        // }
    }
    
}
