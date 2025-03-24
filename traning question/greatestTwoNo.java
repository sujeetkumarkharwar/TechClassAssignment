import java.util.Scanner;

public class greatestTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  1st number:");
        int a=sc.nextInt();
        System.out.println("enter the number:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greatest number");
        }else{
            System.out.println("b is greatest number");
        }
    }
    
}
