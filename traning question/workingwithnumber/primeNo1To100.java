package workingwithnumber;

import java.util.Scanner;

public class primeNo1To100 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number:");
        // int n=sc.nextInt();
        for(int num=2;num<=100;num++){
            if(isPrime(num)){
                System.out.println(num+" ");
            }

        }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i= 2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;   

    }
    
}
