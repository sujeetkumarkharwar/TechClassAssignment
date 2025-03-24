import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  1st number:");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter the 3rd number:");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greatest number");
        }else if(b>c){
            System.out.println("b is greatest number");
        }else{
            System.out.println("c is greatest number");
        }

    }
    
}
