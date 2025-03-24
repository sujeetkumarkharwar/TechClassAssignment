import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hte number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("it is even numner");
        }else{
            System.out.println("it is odd number");
        }
    }
    
}
